package niu.com.hbn;

import java.util.Date;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Short empno;
	private String ename;
	private String job;
	private Short mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Byte deptno;

	private Dept dept;

	// Constructors

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(Short empno) {
		this.empno = empno;
	}

	/** full constructor */
	public Emp(Short empno, String ename, String job, Short mgr, Date hiredate,
			Double sal, Double comm, Byte deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	// Property accessors

	public Short getEmpno() {
		return this.empno;
	}

	public void setEmpno(Short empno) {
		this.empno = empno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Short getMgr() {
		return this.mgr;
	}

	public void setMgr(Short mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + ", dept=" + dept
				+ "]";
	}
	
}