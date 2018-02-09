package niu.com.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Byte deptno;
	private String dname;
	private String loc;
	private Set<Emp> set=new HashSet<Emp>();
	// Constructors
	
	/** default constructor */
	public Dept() {
	}

	public Set<Emp> getSet() {
		return set;
	}

	public void setSet(Set<Emp> set) {
		this.set = set;
	}

	/** minimal constructor */
	public Dept(Byte deptno) {
		this.deptno = deptno;
	}

	/** full constructor */
	public Dept(Byte deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// Property accessors

	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}