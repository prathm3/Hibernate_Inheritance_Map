package com.demo.OnetoMany;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestOnetoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Set<Address2> set = new HashSet<>();
		User2 u = new User2(13, "Ashutosh");
		Address2 add = new Address2(24, "Solapur", u);
		Address2 add1 = new Address2(35, "Indore", u);
		set.add(add1);
		set.add(add);
		u.setSet(set);
		session.save(u);
		tr.commit();
		
		//Retrieve
		User2 u2 = session.get(User2.class, 1);
		System.out.println(u2.getSet());
		
		System.out.println(u);
		System.out.println(add);
		
	}

}
