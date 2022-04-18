package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest
{
	public static void main(String[] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = emfactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		//create one employee
		Employee emp1 = new Employee();
		emp1.setName("Vishal");
		emp1.setSalary(18000);
		entityManager.persist(emp1);
		
		//create one manager
		Manager mgr1 = new Manager();
		mgr1.setName("Shruti");
		mgr1.setSalary(37000);
		mgr1.setDeptName("CS");
		entityManager.persist(mgr1);
		
		// add one more manager
		Manager mgr2 = new Manager();
		mgr2.setName("Raksha");
		mgr2.setSalary(80000);
		mgr2.setDeptName("Chemistry");
		entityManager.persist(mgr2);
		
		
		entityManager.getTransaction().commit();
		
		System.out.println("Successfully added to the database.");
		//entityManager.close();
		//emfactory.close();
	}
}
