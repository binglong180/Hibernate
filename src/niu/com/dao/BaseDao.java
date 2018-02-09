package niu.com.dao;

import niu.com.tool.HibernateUtil;

import org.hibernate.Session;


public class BaseDao {
	public Session currentSession(){
		return HibernateUtil.currentSession();
	}
}
