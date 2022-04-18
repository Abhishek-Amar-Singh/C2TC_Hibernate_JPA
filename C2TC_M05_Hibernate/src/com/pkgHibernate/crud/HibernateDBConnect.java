package com.pkgHibernate.crud;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateDBConnect 
{
	private static SessionFactory objSF;
	
	public static SessionFactory getSessionFactory()
	{
		if(objSF==null)
		{
			try
			{
				Configuration objConfig = new Configuration();
				Properties objProp = new Properties();
				objProp.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				objProp.put(Environment.URL, "jdbc:mysql://localhost:3306/dbhiber");
				objProp.put(Environment.USER, "root");
				objProp.put(Environment.PASS, "");
				objProp.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				objProp.put(Environment.SHOW_SQL, "true");
				objProp.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				objProp.put(Environment.HBM2DDL_AUTO, "update");
				
				objConfig.setProperties(objProp);
				objConfig.addAnnotatedClass(Users.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(objConfig.getProperties()).build();	
				
				System.out.println("Hibernate java config service registry created");
				objSF = objConfig.buildSessionFactory(serviceRegistry);
			}
			catch(HibernateException e)
			{
				System.out.println(e);
			}
		}
		return objSF;
	}
}