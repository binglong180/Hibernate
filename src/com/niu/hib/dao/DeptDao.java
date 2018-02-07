package com.niu.hib.dao;

import java.io.Serializable;

import org.hibernate.classic.Session;

import com.niu.hib.pojo.Dept;

public interface DeptDao {
	void addDept(Dept dept, Session session);

	/**
	 * 
	 * 根据id获得信息！
	 * 
	 * @author 牛牛
	 * 
	 * @date 2018-2-7
	 * 
	 * @param id
	 * @return
	 */
	Dept get(Serializable id, Session session);

	Dept load(Serializable id, Session session);

	void delet(Dept dept, Session session);
}
