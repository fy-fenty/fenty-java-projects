package com.ssxn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ssxn.model.Clientchoose;
import com.ssxn.model.Clientlook;
import com.ssxn.model.Clientsend;
import com.ssxn.model.Clientshoot;
import com.ssxn.model.Contact;
import com.ssxn.model.Identity;
import com.ssxn.model.Member;
import com.ssxn.model.Morder;
import com.ssxn.model.Muser;

public class LocalTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.get(Clientchoose.class, 0);
		sess.get(Clientlook.class, 0);
		sess.get(Clientsend.class, 0);
		sess.get(Clientshoot.class, 0);
		sess.get(Contact.class, 0);
		sess.get(Identity.class, 0);
		sess.get(Member.class, 0);
		sess.get(Morder.class, 0);
		sess.get(Muser.class, 0);
	}
}