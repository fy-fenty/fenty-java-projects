package com.ssxn.support;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.ssxn.util.ReflectionUtils;

@SuppressWarnings("unchecked")
public class SimpleDAO<T, PK extends Serializable> implements ISimpleDAO<T, PK> {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	protected SessionFactory sessionFactory;

	protected Class<T> entityClass;

	public SimpleDAO() {
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass());
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(final T entity) {
		Assert.notNull(entity, "entity不能为空");
		getSession().saveOrUpdate(entity);
	}

	public T saveNew(final T entity) {
		Assert.notNull(entity, "entity不能为空");
		return (T) getSession().merge(entity);

	}

	public void delete(final T entity) {
		Assert.notNull(entity, "entity不能为空");
		getSession().delete(entity);
	}

	public void delete(final PK id) {
		Assert.notNull(id, "id不能为空");
		delete(get(id));
	}

	public T get(final PK id) {
		Assert.notNull(id, "id不能为空");
		return (T) getSession().get(entityClass, id);
	}

	public <X> X get(Class<X> clazz, Serializable id) {
		Assert.notNull(clazz, "class不能为空");
		Assert.notNull(id, "id不能为空");
		return (X) getSession().get(clazz, id);
	}

	public <X> List<X> find(final String hql) {
		return createQuery(hql).list();
	}

	public <X> List<X> find(final String hql, final Object... values) {
		return createQuery(hql, values).list();
	}

	public <X> List<X> find(final String hql, final Map<String, Object> values) {
		return createQuery(hql, values).list();
	}

	public <X> X findUnique(final String hql, final Object... values) {
		return (X) createQuery(hql, values).uniqueResult();
	}

	public <X> X findUnique(final String hql, final Map<String, Object> values) {
		return (X) createQuery(hql, values).uniqueResult();
	}

	public Query createQuery(final String hql, final Object... values) {
		Assert.hasText(hql, "queryString不能为空");
		Query query = getSession().createQuery(hql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}

	public Query createQuery(final String hql, final Map<String, Object> values) {
		Assert.hasText(hql, "queryString不能为空");
		Query query = getSession().createQuery(hql);
		if (values != null) {
			query.setProperties(values);
		}
		return query;
	}

	public SQLQuery createSQLQuery(final String sql, final Object... values) {
		Assert.hasText(sql, "queryString不能为空");
		SQLQuery query = getSession().createSQLQuery(sql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}

	public SQLQuery createSQLQuery(final String sql, final Map<String, Object> values) {
		Assert.hasText(sql, "queryString不能为空");
		SQLQuery query = getSession().createSQLQuery(sql);
		if (values != null) {
			query.setProperties(values);
		}
		return query;
	}

	public String getTableName() {
		return (entityClass + "").substring((entityClass + "").lastIndexOf(".") + 1);
	}
}