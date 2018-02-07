package com.niu.hib.dao;

import java.io.Serializable;

import org.hibernate.classic.Session;

import com.niu.hib.pojo.Dept;

public class DeptDaoImpl implements DeptDao {

	@Override
	public void addDept(Dept dept, Session session) {
		session.save(dept);
	}

	@Override
	public Dept get(Serializable id, Session session) {
		return (Dept) session.get(Dept.class, id);
	}

	@Override
	public Dept load(Serializable id, Session session) {
		return (Dept) session.load(Dept.class, id);
	}

	@Override
	public void delet(Dept dept, Session session) {
		session.delete(dept);
	}

}
