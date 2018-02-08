import org.junit.Test;

import com.niu.hib.pojo.Dept;
import com.niu.hib.service.dept.DeptService;
import com.niu.hib.service.dept.DeptServiceImpl;

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
		dept.setLoc("吕梁");
		dept.setDeptno(new Short("80"));
		try {
			Dept update = ds.update(dept);
			System.out.println(update);
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
