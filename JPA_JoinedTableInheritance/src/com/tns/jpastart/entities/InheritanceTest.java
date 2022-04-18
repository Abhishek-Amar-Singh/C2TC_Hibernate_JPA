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
		emp1.setName("Suresh");
		emp1.setSalary(17000);
		entityManager.persist(emp1);
		
		//create one manager
		Manager mgr1 = new Manager();
		mgr1.setName("Ramesh");
		mgr1.setSalary(40000);
		mgr1.setDeptName("HR");
		entityManager.persist(mgr1);
		
		Employee emp2 = new Employee();
		emp2.setName("Raju");
		emp2.setSalary(15000);
		entityManager.persist(emp2);
		
		Manager mgr2 = new Manager();
		mgr2.setName("Kajol");
		mgr2.setSalary(35000);
		mgr2.setDeptName("Sales");
		entityManager.persist(mgr2);
		
		entityManager.getTransaction().commit();
		
		System.out.println("Successfully added to the database.");
	}
}
