package org.fengyao;

import org.fengyao.services.IMuserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctc = new ClassPathXmlApplicationContext(new String[]{
				"hib-spring.xml", "beans.xml"
				});
		IMuserService muserService = ctc.getBean("muser_service", IMuserService.class);
		String muname = "test", mupwd = "test";
		System.out.println(muserService.login(muname, mupwd));
	}
}