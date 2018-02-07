package com.niu.hib.service;

import java.io.Serializable;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.niu.hib.dao.DeptDao;
import com.niu.hib.dao.DeptDaoImpl;
import com.niu.hib.pojo.Dept;
import com.niu.hib.util.HibernateUtil;

public class DeptServiceImpl implements DeptService {
	DeptDao dd = null;
	Transaction tx = null;
	Session session = null;

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

	@Override
	public Dept get(Serializable id) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Dept dept = null;
		dd = new DeptDaoImpl();
		try {
			dept = dd.get(id, session);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
		}
		return dept;
	}

	@Override
	public Dept load(Serializable id) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Dept dept = null;
		dd = new DeptDaoImpl();
		try {
			dept = dd.load(id, session);
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
		}
		return dept;
	}
	//使用Merge更新数据
	@Override
	public Dept update(Dept dept) {
		Dept updateDept=null;
		dd = new DeptDaoImpl();
		try {
			session = HibernateUtil.currentSession();
			tx = session.beginTransaction();
			updateDept = (Dept) session.merge(dept);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
		}
		return updateDept;
	}

	@Override
	public void delet(Byte id) {
		dd = new DeptDaoImpl();
		try {
			session = HibernateUtil.currentSession();
			tx = session.beginTransaction();
			Dept updateDept = dd.load(id, session);
			dd.delet(updateDept, session);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
		}

	}

}
