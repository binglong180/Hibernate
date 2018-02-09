package empTest;

import java.util.List;

import org.junit.Test;

import com.niu.hib.pojo.Emp;
import com.niu.hib.pojo.EmpCollection;
import com.niu.hib.service.emp.EmpService;
import com.niu.hib.util.StringUtil;

public class EmpTest {
	@Test
	public void test() {
		EmpService es = new EmpService();
		try {
			System.out.println(es.getAllList());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void test_iterate() {
		EmpService es = new EmpService();
		try {
			es.getAllList_iterate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void test2() {
		EmpService es = new EmpService();
		try {
			Emp empbyENAME = es.getEmpbyENAME("ALLEN");
			System.out.println(empbyENAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {
		EmpService es = new EmpService();
		try {
			Emp empbyENAME = es.getEmpbyENAME_2("ALLEN");
			System.out.println(empbyENAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test4() {
		EmpService es = new EmpService();
		try {
			Emp emp = new Emp();
			emp.setSAL(1000.0);
			emp.setJOB("SALESMAN");
			List<Emp> listByCon = es.getListByCon(emp);
			System.out.println(listByCon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test5() {
		EmpService es = new EmpService();
		try {
			EmpCollection emp = new EmpCollection();
			emp.setSAL(1000.0);
			emp.setJOB("SALESMAN");
			emp.setFrom(StringUtil.StrToDate("1981-02-01", "yyyy-MM-dd"));
			emp.setTo(StringUtil.StrToDate("1981-09-01", "yyyy-MM-dd"));

			List<Emp> listByCon = es.getListByCon(emp);
			System.out.println(listByCon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
