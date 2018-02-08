package com.niu.hib.service.dept;


import java.io.Serializable;

import org.hibernate.classic.Session;

import com.niu.hib.pojo.Dept;

public interface DeptService {
	void addDept(Dept dept);
	Dept get(Serializable id);
	Dept load(Serializable id);
	Dept update(Dept dept);
	void delet(Byte id);
}
