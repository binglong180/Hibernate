package niu.com.dao;

import java.util.List;

import niu.com.hbn.Emp;

@SuppressWarnings("unchecked")
public class EmpDao extends BaseDao {
	public List<Emp> getEmp(Emp emp) {
		return this.currentSession().createQuery("from Emp where empno=:empno")
				.setProperties(emp).list();
	}
}
