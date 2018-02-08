package com.niu.hib.service.emp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Transaction;

import com.niu.hib.dao.emp.EmpDao;
import com.niu.hib.pojo.Emp;

public class EmpService {
	EmpDao ed = null;
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
			while(empList.hasNext()){
				Emp emp=empList.next();
				System.out.println(emp);
			}
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		return empList;
	}
}
