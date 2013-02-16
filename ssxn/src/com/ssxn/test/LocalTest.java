package com.ssxn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssxn.service.IIdentityService;

public class LocalTest {

	public static void main(String[] args) {
		// SessionFactory sf = new
		// Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Session sess = sf.getCurrentSession();
		// Transaction tran = sess.beginTransaction();
		ApplicationContext ctc = new ClassPathXmlApplicationContext("applicationContext.xml");
		IIdentityService md = ctc.getBean("identityService", IIdentityService.class);
		
	}
}