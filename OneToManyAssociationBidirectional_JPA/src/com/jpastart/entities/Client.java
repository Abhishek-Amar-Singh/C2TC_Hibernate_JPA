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
		
		Department department1 = new Department();
		department1.setId(122);
		department1.setName("Physics");
		
		Department department2 = new Department();
		department2.setId(123);
		department2.setName("Biology");
		
		Employee employee1 = new Employee();
		employee1.setEid(1);
		employee1.setEname("Dimple");
		employee1.setEsalary(20000);
		
		Employee employee2 = new Employee();
		employee2.setEid(2);
		employee2.setEname("Shruti");
		employee2.setEsalary(18000);
		
		Employee employee3 = new Employee();
		employee3.setEid(3);
		employee3.setEname("Raksha");
		employee3.setEsalary(19000);
		
		department1.addEmployee(employee1);
		department2.addEmployee(employee2);
		department2.addEmployee(employee3);
		
		entityManager.persist(department1);
		entityManager.persist(department2);
		
		entityManager.getTransaction().commit();
		System.out.println("Successfully added to sheet.employee and sheet.department");
	}
}