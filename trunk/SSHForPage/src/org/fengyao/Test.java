package org.fengyao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new ClassPathXmlApplicationContext("hibernate-spring.xml").getBean("sessionFactory",SessionFactory.class);
		Session session = sf.openSession();
		SQLQuery sq = session.createSQLQuery("select mname,mpqwd from muser where mid < 10");
		Query query = sq.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List<Map> list = query.list();
		System.out.println(list.get(0).get("MNAME"));
	}
}