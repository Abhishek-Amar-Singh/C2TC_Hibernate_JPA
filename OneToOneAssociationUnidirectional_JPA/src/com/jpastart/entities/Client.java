//OneToOneAssociationUniDirectional

package com.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client
{
	public static void main(String[] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = emfactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Student student1 = new Student();
		student1.setName("Suresh");
		Address homeAddress1 = new Address();
		homeAddress1.setStreet("Suvarna Nagar");
		homeAddress1.setCity("Mumbai");
		homeAddress1.setState("Maharashtra");
		homeAddress1.setZipCode(400056);
		student1.setAddress(homeAddress1);//inject address into student
		entityManager.persist(student1);//persist only student, no need to persist address explicitly
		
		entityManager.getTransaction().commit();
		System.out.println("Added one student with address to the sheet.student and sheet.address");
	}
}
