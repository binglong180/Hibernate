package com.niu.hib.dao;

import org.hibernate.classic.Session;

import com.niu.hib.pojo.Dept;

public class DeptDaoImpl implements DeptDao {

	@Override
	public void addDept(Dept dept,Session session) {
		session.save(dept);
	}

	

}
