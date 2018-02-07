package com.niu.hib.dao;

import org.hibernate.classic.Session;

import com.niu.hib.pojo.Dept;

public interface DeptDao {
	void addDept(Dept dept,Session session);
}
