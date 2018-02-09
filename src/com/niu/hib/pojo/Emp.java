package com.niu.hib.pojo;

import java.util.Date;

public class Emp {
	private Short EMPNO;
	private String ENAME;
	private String JOB;
	private Short MGR;
	private Date HIREDATE;
	private Double SAL;
	private Double COMM;
	private Short DEPTNO;
	public Short getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(Short eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public Short getMGR() {
		return MGR;
	}
	public void setMGR(Short mGR) {
		MGR = mGR;
	}
	public Date getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public Double getSAL() {
		return SAL;
	}
	public void setSAL(Double sAL) {
		SAL = sAL;
	}
	public Double getCOMM() {
		return COMM;
	}
	public void setCOMM(Double cOMM) {
		COMM = cOMM;
	}
	public Short getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(Short dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public Emp(Short eMPNO, String eNAME, String jOB, Short mGR, Date hIREDATE,
			Double sAL, Double cOMM, Short dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB
				+ ", MGR=" + MGR + ", HIREDATE=" + HIREDATE + ", SAL=" + SAL
				+ ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
	}
	public Emp(String eNAME, String jOB) {
		super();
		ENAME = eNAME;
		JOB = jOB;
	}
	
}
