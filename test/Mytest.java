import org.junit.Test;

import com.niu.hib.pojo.Dept;
import com.niu.hib.service.DeptService;
import com.niu.hib.service.DeptServiceImpl;

public class Mytest {
	DeptService ds = new DeptServiceImpl();

	@Test
	public void test() {
		Dept dept = new Dept();
		dept.setDname("北京1");
		dept.setLoc("五道口2");
		dept.setDeptno(new Byte("88"));
		ds.addDept(dept);
	}

	@Test
	public void test1() {
		Dept dept = ds.get(new Byte("12"));
		System.out.println(dept);
	}

	@Test
	public void test2() {
		try {
			Dept dept = ds.load(new Byte("12"));
			System.out.println(dept);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void test3() {
		Dept dept = new Dept();
		dept.setDname("山西");
		dept.setLoc("岚县");
		dept.setDeptno(new Byte("80"));
		try {
			ds.update(dept);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	@Test
	public void test4() {
		
		try {
			ds.delet(new Byte("80"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
