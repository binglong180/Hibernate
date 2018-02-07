import org.junit.Test;

import com.niu.hib.pojo.Dept;
import com.niu.hib.service.DeptService;
import com.niu.hib.service.DeptServiceImpl;


public class Mytest {
		DeptService ds=new DeptServiceImpl();
		@Test
		public void test(){
			Dept dept=new Dept();
			dept.setDname("北京1");
			dept.setLoc("五道口2");
			dept.setDeptno(new Byte("88"));
			ds.addDept(dept);
		}
}
