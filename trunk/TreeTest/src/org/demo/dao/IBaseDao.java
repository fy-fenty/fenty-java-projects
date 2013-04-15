package org.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface IBaseDao<T, PK extends Serializable> {

	public T getById(PK id);

	public void add(T t);

	public void del(T t);

	public List<T> findByHql(String hql, Object... args);
	
	public List<T> findAll();

	public Session getCurrentSession();
}