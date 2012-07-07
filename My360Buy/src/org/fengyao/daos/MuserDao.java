package org.fengyao.daos;

import org.fengyao.entities.Muser;
import org.hibernate.SessionFactory;

public class MuserDao {

	private SessionFactory sessionFactory;

	public Muser findUserByNameAndPwd(String muname, String mupwd) {
//		Muser m = (Muser) sessionFactory.getCurrentSession().createQuery("from Muser where muname=? and mupwd=?").setString(0, muname)
//				.setString(1, mupwd).uniqueResult();
		Muser m = new Muser(1, "test", "test");
		return m;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}