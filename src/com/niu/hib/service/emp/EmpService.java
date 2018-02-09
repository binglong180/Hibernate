package com.niu.hib.service.emp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Transaction;

import com.niu.hib.dao.emp.EmpDao;
import com.niu.hib.pojo.Emp;
import com.niu.hib.pojo.EmpCollection;

public class EmpService {
	EmpDao ed = null;
	public List<Emp> getListByCon(EmpCollection emp) {
		List<Emp> empList = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			empList = ed.getEmpList();
			StringBuffer sql = new StringBuffer("from Emp where 1=1 ");
			if (emp.getSAL() != null)
				sql.append("and SAL>:SAL ");
			if (emp.getJOB() != null)
				sql.append("and JOB=:JOB ");
			if (emp.getFrom() != null)
				sql.append("and HIREDATE>:from ");
			if (emp.getTo() != null)
				sql.append("and HIREDATE<:to ");
			empList = ed.getListByCon(sql.toString(), emp);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		return empList;

	}
	public List<Emp> getListByCon(Emp emp) {
		List<Emp> empList = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			empList = ed.getEmpList();
			StringBuffer sql = new StringBuffer("from Emp where 1=1 ");
			if (emp.getSAL() != null)
				sql.append("and SAL>:SAL ");
			if (emp.getJOB() != null)
				sql.append("and JOB=:JOB ");
			empList = ed.getListByCon(sql.toString(), emp);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		return empList;

	}

	public List<Emp> getAllList() {
		List<Emp> empList = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			empList = ed.getEmpList();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		return empList;
	}

	public Iterator<Emp> getAllList_iterate() {
		Iterator<Emp> empList = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			empList = ed.getEmpList_iterate();
			while (empList.hasNext()) {
				Emp emp = empList.next();
				System.out.println(emp);
			}
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		return empList;
	}

	public Emp getEmpbyENAME(String eName) {
		Emp emp = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			emp = ed.getEmpbyENAME(eName);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return emp;
	}

	public Emp getEmpbyENAME_2(String eName) {
		Emp emp = null;
		ed = new EmpDao();
		Transaction tx = ed.currentSession().beginTransaction();
		try {
			emp = ed.getEmpbyENAME_2(eName);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return emp;
	}

}
