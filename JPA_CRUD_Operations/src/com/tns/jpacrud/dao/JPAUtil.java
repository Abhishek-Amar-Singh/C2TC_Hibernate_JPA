package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
	private static EntityManagerFactory emFactory;
	private static EntityManager entityManager;
	
	static
	{
		emFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		if(entityManager == null || !entityManager.isOpen())
		{
			entityManager = emFactory.createEntityManager();
		}
		return entityManager;
	}
}

/*
 * client -> Service -> dao -> xml
*/