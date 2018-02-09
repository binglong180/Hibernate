package mytest;


import org.junit.Test;

import niu.com.hbn.Dept;
import niu.com.hbn.Emp;
import niu.com.service.EmpService;

public class MyTest {
	@Test
	public void test(){
		EmpService es=new EmpService();
		try {
			Emp emp=new Emp();
			emp.setEmpno((short) 7369);
			es.getEmp(emp);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test1(){
		EmpService es=new EmpService();
		try {
			Dept dept=new Dept();
			dept.setDeptno((byte) 20);
			es.getDept(dept);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
