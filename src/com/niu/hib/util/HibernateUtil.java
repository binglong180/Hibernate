package com.niu.hib.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateUtil {
	private static Configuration conf;
	private final static SessionFactory sessionFactory;
	static {
		try {
			conf = new Configuration().configure();
			sessionFactory = conf.buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e);
			throw new ExceptionInInitializerError(e);
		}

	}

	public static Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
}
