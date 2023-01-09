package com.demo.OnetoOneBiDir;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestOneToOneBiDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address1 add = new Address1();
		User1 u = new User1(12, "Ashuthosh", add);
		add.setAid(23);
		add.setCity("Solapur");
		u.setAdd(add);
		session.save(u);
		
		//Retrieve
		Address1 address1 = session.get(Address1.class, 1);
		System.out.println(address1.getU() + "/n" + address1.getCity());
		tr.commit();
		System.out.println(add);
		System.out.println(u);
	}

}
