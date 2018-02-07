package com.niu.hib.dao;

import org.hibernate.Session;

import com.niu.hib.util.HibernateUtil;

public class BaseDao {
	public Session currentSession(){
		return HibernateUtil.currentSession();
	}
}
