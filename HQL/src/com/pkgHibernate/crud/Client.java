// HQL - Hibernate Query Language

package com.pkgHibernate.crud;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;


public class Client
{
	public static void main(String[] args)
	{
		Session session = HibernateDBConnect.getSessionFactory().openSession();
		
		try
		{
			//Deleting
			String str = "DELETE users WHERE firstName='Vishal'";
			session.beginTransaction();
			Query query = session.createQuery(str);
			query.executeUpdate();
			session.getTransaction().commit();
			
			//Retrieval
			String strr = "FROM users";
			session.beginTransaction();
			Query queryy = session.createQuery(strr);
			@SuppressWarnings("unchecked")
			List<Users> alist = queryy.getResultList();
			for(Users u : alist)
			{
				System.out.println(u);
			}
			session.getTransaction().commit();
		}
		finally
		{
			session.close();
		}
	}
}