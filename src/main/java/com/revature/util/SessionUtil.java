package com.revature.util;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
//		sessionFactory = metaData.getSessionFactoryBuilder().build();
	}
	public static Session getSession() {
		 if (sessionFactory == null) {
		      try {
		        // Create registry
		        registry = new StandardServiceRegistryBuilder()
		            .configure()
		            .build();

		        // Create MetadataSources
		        MetadataSources sources = new MetadataSources(registry);

		        // Create Metadata
		        Metadata metadata = sources.getMetadataBuilder().build();

		        // Create SessionFactory
		        sessionFactory = metadata.getSessionFactoryBuilder().build();

		      } catch (Exception e) {
		        e.printStackTrace();
		        if (registry != null) {
		          StandardServiceRegistryBuilder.destroy(registry);
		        }
		      }
		    }
		    return sessionFactory.openSession();
	}
}

//package com.revature.util;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//public class SessionUtil {
//	
//	private static SessionFactory sessionFactory;
//	
//	static {
//		try {
//			Class.forName("org.postgresql.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		StandardServiceRegistry standardRegistry =
//				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metaData = 
//				new MetadataSources(standardRegistry).getMetadataBuilder().build();
//		sessionFactory = metaData.getSessionFactoryBuilder().build();
//	}
//	
//	public static Session getSession(){
//		return sessionFactory.openSession();
//	}
//
//}