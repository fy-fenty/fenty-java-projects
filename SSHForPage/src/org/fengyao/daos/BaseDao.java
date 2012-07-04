package org.fengyao.daos;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class BaseDao<T> {
	private SessionFactory sessionFactory;

	private Class clazz;

	public BaseDao() {
		super();
		clazz = getParameterizedTypeByParent(super.getClass());
	}

	private Class getParameterizedTypeByParent(Class clazz) {
		Type tp = clazz.getGenericSuperclass();
		if (tp instanceof ParameterizedType) {
			return (Class) ((ParameterizedType) tp).getActualTypeArguments()[0];
		} else {
			throw new ClassCastException("this is not ParameterizedType type");
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List findAll() {
		List results = getSession().createCriteria(clazz).list();
		return results;
	}

	public T findById(Integer id) {
		T result = (T) getSession().get(clazz, id);
		return result;
	}

	public void update(T obj) {
		getSession().save(obj);
	}
 
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}