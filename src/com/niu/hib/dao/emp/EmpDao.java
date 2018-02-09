package com.niu.hib.dao.emp;

import java.util.Iterator;
import java.util.List;

import com.niu.hib.dao.BaseDao;
import com.niu.hib.pojo.Emp;
import com.niu.hib.pojo.EmpCollection;

@SuppressWarnings("unchecked")
public class EmpDao extends BaseDao {

	public List<Emp> getEmpList() {
		return this.currentSession().createQuery("from Emp").list();
	}

	public Iterator<Emp> getEmpList_iterate() {
		return this.currentSession().createQuery("from Emp").iterate();
	}
	public List<Emp> getListByCon(String sql,Emp emp) {
		return this.currentSession().createQuery(sql).setProperties(emp).list();
	}
	public List<Emp> getListByCon(String sql,EmpCollection emp) {
		return this.currentSession().createQuery(sql).setProperties(emp).list();
	}
	public Emp getEmpbyENAME(String eName) {
		String sql = "from Emp where ENAME=?";
		return (Emp) this.currentSession().createQuery(sql)
				.setString(0, eName).uniqueResult();
	}
	public Emp getEmpbyENAME_2(String eName) {
		String sql = "from Emp where ENAME=:name";
		return (Emp) this.currentSession().createQuery(sql)
				.setString("name", eName).uniqueResult();
	}
}

