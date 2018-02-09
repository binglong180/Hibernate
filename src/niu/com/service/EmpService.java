package niu.com.service;

import java.util.List;

import org.hibernate.Transaction;

import niu.com.dao.EmpDao;
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
}
