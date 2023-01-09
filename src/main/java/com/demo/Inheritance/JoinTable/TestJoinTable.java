package com.demo.Inheritance.JoinTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestJoinTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session session=sf.getCurrentSession();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Contract2 c = new Contract2(23);
		Salaried2 s = new Salaried2();
		session.save(c);
		session.save(s);
		tr.commit();
	}
}
