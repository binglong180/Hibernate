package empTest;

import org.junit.Test;

import com.niu.hib.service.emp.EmpService;

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
}
