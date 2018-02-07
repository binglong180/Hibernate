package com.niu.hib.service;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.niu.hib.dao.DeptDao;
import com.niu.hib.dao.DeptDaoImpl;
import com.niu.hib.pojo.Dept;
import com.niu.hib.util.HibernateUtil;

public class DeptServiceImpl implements DeptService {
	DeptDao dd = null;

	@Override
	public void addDept(Dept dept) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		dd = new DeptDaoImpl();
		try {
			dd.addDept(dept, session);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
		}

	}

}
