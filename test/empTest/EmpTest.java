package empTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Test
	public void test6() {
		EmpService es = new EmpService();
		try {
			Map<String, Object> emp = new HashMap<String, Object>();
			emp.put("salname", 1000.0);
			emp.put("job", "SALESMAN");
			emp.put("form", StringUtil.StrToDate("1981-02-01", "yyyy-MM-dd"));
			emp.put("to", StringUtil.StrToDate("1981-09-01", "yyyy-MM-dd"));
			List<Emp> listByCon = es.getListByCon(emp);
			System.out.println(listByCon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test7() {
		EmpService es = new EmpService();
		try {
			List<Emp> pager = es.getPager(3, 2);
			System.out.println(pager);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test8() {
		EmpService es = new EmpService();
		try {
			Long count = es.getCount();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
