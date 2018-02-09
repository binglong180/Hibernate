package niu.com.dao;

import java.util.List;

import niu.com.hbn.Dept;
import niu.com.hbn.Emp;

@SuppressWarnings("unchecked")
public class EmpDao extends BaseDao {
	public List<Emp> getEmp(Emp emp) {
		return this.currentSession().createQuery("from Emp where empno=:empno")
				.setProperties(emp).list();
	}
	
	public List<Dept> getDept(Dept dept) {
		return this.currentSession().createQuery("from Dept where deptno=:deptno")
				.setProperties(dept).list();
	}
}
