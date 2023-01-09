package com.demo.Embeddable;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.OnetoOneBiDir.Address1;



public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address add = new Address(23, "Solapur");
		User u = new User(12, "Ashuthosh", add);
		session.save(u);
		tr.commit();
		
		//Retrieve
		Address address1 = session.get(Address.class, 1);
		System.out.println( address1.getCity());
		User user1 = session.get(User.class, 1);
		System.out.println(user1.getAdd());
		System.out.println(add);
		System.out.println(u);
	}

}
