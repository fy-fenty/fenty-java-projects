package com.ssxn.util;

import javax.servlet.http.HttpServletResponse;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.struts2.ServletActionContext;

public class LoginAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invoke) throws Throwable {
		HttpServletResponse res = ServletActionContext.getResponse();
		Object obj = invoke.proceed();
//		System.out.println(invoke.getMethod());
//		if ("findMuserByNameForLogin".equals(invoke.getMethod().getName())) {
//			return obj;
//		}
//		if (ServletActionContext.getRequest().getSession().getAttribute(UserAction.SESSION_USER) == null) {
//			System.out.println("not login");
//			res.sendRedirect("login");
//		}
		return obj;
	}

}