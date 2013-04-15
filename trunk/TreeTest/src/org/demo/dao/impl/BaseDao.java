package org.demo.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.demo.dao.IBaseDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class BaseDao<T, PK extends Serializable> implements IBaseDao<T, PK> {

	@Resource
	protected SessionFactory sessionFactory;

	protected Class entityClass;

	public BaseDao() {
		Type tp = super.getClass().getGenericSuperclass();
		if (tp instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) tp;
			this.entityClass = (Class) pt.getActualTypeArguments()[0];
		} else {
			this.entityClass = Object.class;
		}
	}

	@Override
	public T getById(PK id) {
		return (T) getCurrentSession().get(entityClass, id);
	}

	@Override
	public void add(T t) {
		getCurrentSession().save(t);
	}

	@Override
	public void del(T t) {
		getCurrentSession().delete(t);
	}

	@Override
	public List<T> findByHql(String hql, Object... args) {
		Session sess = getCurrentSession();
		Query query = sess.createQuery(hql);
		for (int i = 0; i < args.length; i++) {
			query.setParameter(i, args[i]);
		}
		return query.list();
	}

	@Override
	public List<T> findAll() {
		Criteria ct = getCurrentSession().createCriteria(entityClass);
		return ct.list();
	}

	public Session getCurrentSession() {
		return sessionFactory.openSession();
	}
}