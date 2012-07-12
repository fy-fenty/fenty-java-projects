package org.fengyao.aops;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.hibernate.SessionFactory;

public class VoteInter implements MethodInterceptor {

	private SessionFactory sessionFactory;

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object result = arg0.proceed();
		return result;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}