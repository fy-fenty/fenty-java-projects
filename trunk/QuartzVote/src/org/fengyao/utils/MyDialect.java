package org.fengyao.utils;

import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.dialect.Oracle10gDialect;

public class MyDialect extends Oracle10gDialect {
	public MyDialect() {
		super();
		registerHibernateType(Types.DATE, Hibernate.TIMESTAMP.getName());
		registerHibernateType(Hibernate.BIG_DECIMAL.sqlType(), Hibernate.STRING.getName());
	}
}