package niu.com.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;

import niu.com.dao.EmpDao;
import niu.com.hbn.Dept;
import niu.com.hbn.Emp;

public class EmpService {
	EmpDao ed = new EmpDao();

	public List<Emp> getEmp(Emp emp) {
		List<Emp> list = null;

		Transaction tx = null;
		try {
			tx = ed.currentSession().beginTransaction();
			list = ed.getEmp(emp);
			for (Emp emp2 : list) {
				System.out.println(emp2);
				System.out.println(emp2.getDept().getDname());
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx)
				tx.rollback();
		}

		return list;

	}

	public List<Dept> getDept(Dept dept) {
		List<Dept> list = null;

		Transaction tx = null;
		try {
			tx = ed.currentSession().beginTransaction();
			list =  ed.getDept(dept);
			for (Dept dept2 : list) {
				System.out.println(dept2.getDname());
				Set<Emp> set = dept2.getSet();
				for (Emp emp : set) {
					System.out.println(emp);
				}
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx)
				tx.rollback();
		}
		return list;

	}
}
