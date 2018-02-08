package com.niu.hib.dao.emp;

import java.util.Iterator;
import java.util.List;

import com.niu.hib.dao.BaseDao;
import com.niu.hib.pojo.Emp;

@SuppressWarnings("unchecked")
public class EmpDao extends BaseDao {

	public List<Emp> getEmpList() {
		return this.currentSession().createQuery("from Emp").list();
	}

	public Iterator<Emp> getEmpList_iterate() {
		return this.currentSession().createQuery("from Emp").iterate();
	}

}
