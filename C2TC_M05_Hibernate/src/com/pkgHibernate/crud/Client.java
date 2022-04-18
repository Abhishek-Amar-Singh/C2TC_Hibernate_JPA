package com.pkgHibernate.crud;

import org.hibernate.Session;

public class Client
{
	public static void main(String[] args)
	{
		Session session = HibernateDBConnect.getSessionFactory().openSession();
		
		//CRUD operations 
		/*// step 1: Create
		Users userC = new Users("Shruti18", "shruti@18", "Shruti", "Mutta");
		session.beginTransaction();
		session.save(userC);
		session.getTransaction().commit();
		System.out.println(userC.toString());*/
		
		/*
		// step 2: Retrieval
		Users userR = new Users();
		session.beginTransaction();
		userR = session.get(Users.class, 3);//fetching data based on userid
		System.out.println(userR);
		session.getTransaction().commit();
		
		// step 3: Update
		Users userU=new Users();
		session.beginTransaction();
		userU=session.get(Users.class, 3); 
		userU.setLastName("Bhanushali");
		System.out.println(userU);
		session.getTransaction().commit();*/
					
		// step 4: Delete
		Users userD=new Users();
		session.beginTransaction();
		userD=session.get(Users.class, 4); 
		session.delete(userD);
		session.getTransaction().commit();
	}
}