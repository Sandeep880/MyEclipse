package com.hibernateDemo;

import com.hibernate.Entity.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                  .configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//Create object of entity class type
			Users user = new Users(12345,"username","password","firstname","lasname");
			// Start Transaction
			session.beginTransaction();
			//Perform operation
			session.save(user);
			// Commit the Transaction
			session.getTransaction().commit();
			System.out.println("Row added");
			
		} finally {
			session.close();
			factory.close();
		}
		
	}

}
