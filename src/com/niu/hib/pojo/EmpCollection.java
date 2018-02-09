package com.niu.hib.pojo;

import java.util.Date;

public class EmpCollection {
	private Short EMPNO;
	private String ENAME;
	private String JOB;
	private Short MGR;
	private Date HIREDATE;
	private Double SAL;
	private Double COMM;
	private Short DEPTNO;
	private Date from;
	private Date to;

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

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

}
