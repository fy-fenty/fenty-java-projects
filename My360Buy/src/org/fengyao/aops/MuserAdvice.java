package org.fengyao.aops;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.hibernate.SessionFactory;

public class MuserAdvice implements MethodInterceptor {

	private SessionFactory sessionFactory;

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("in");
		Object obj = arg0.proceed();
		System.out.println("out");
		return obj;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}