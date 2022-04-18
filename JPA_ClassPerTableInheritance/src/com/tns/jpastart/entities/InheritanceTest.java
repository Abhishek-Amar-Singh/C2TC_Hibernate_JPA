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
		emp1.setName("Dimple");
		emp1.setSalary(21000);
		entityManager.persist(emp1);
		
		//create one manager
		Manager mgr1 = new Manager();
		mgr1.setName("Amaan");
		mgr1.setSalary(40000);
		mgr1.setDeptName("IT");
		entityManager.persist(mgr1);
		
		entityManager.getTransaction().commit();
		
		System.out.println("Successfully added to the database.");
	}
}
