package com.demo.Inheritance.SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSingleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session session=sf.getCurrentSession();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Contract c = new Contract(23);
		Salaried s = new Salaried();
		session.save(c);
		session.save(s);
		tr.commit();
	}
}
