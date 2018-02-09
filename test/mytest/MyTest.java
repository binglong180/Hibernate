package mytest;

import java.util.List;

import org.junit.Test;

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
}
