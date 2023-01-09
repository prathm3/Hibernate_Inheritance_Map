package com.demo.Inheritance.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTablePerClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session session=sf.getCurrentSession();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Contract1 c = new Contract1(23);
		Salaried1 s = new Salaried1(345);
		session.save(c);
		session.save(s);
		tr.commit();
	}
}
