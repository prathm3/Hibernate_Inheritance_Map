package com.demo.ManytoMany;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class TestManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		User3 ul4 = new User3();
		ul4.setName("Parag");
		User3 ul2 = new User3();
		ul2.setName("Shreyas");
		
		Set<User3> userset = new HashSet<>();
		userset.add(ul4);
		userset.add(ul2);
		Address3 a1 = new Address3(12,"Pune",userset);
		Address3 a2 = new Address3(13,"Maharashtra",userset);
		Set<Address3> addrset = new HashSet<>();
		addrset.add(a1);
		addrset.add(a2);
		ul4.setSet(addrset);
		ul2.setSet(addrset);
		session.save(ul4);
		session.save(ul2);
		
		//Retrieve
		User3  u1 = session.get(User3.class, 1);
		Address3 add1 = session.get(Address3.class, 1);
		System.out.println(u1.getSet());
		System.out.println(add1.getU3());
		
		tr.commit();
		session.close();
		
	}

}
