package bit.com.a.dto;

import java.io.Serializable;

public class DepartmentDto implements Serializable{
	
	private int deptCode;
	private String deptName;
	private int comCode;
	private int wpCode;
	private int parentDept;
	private int del;
	
	public DepartmentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public DepartmentDto(int deptCode, String deptName, int comCode, int wpCode, int parentDept, int del) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.comCode = comCode;
		this.wpCode = wpCode;
		this.parentDept = parentDept;
		this.del = del;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getComCode() {
		return comCode;
	}

	public void setComCode(int comCode) {
		this.comCode = comCode;
	}

	public int getWpCode() {
		return wpCode;
	}

	public void setWpCode(int wpCode) {
		this.wpCode = wpCode;
	}

	public int getParentDept() {
		return parentDept;
	}

	public void setParentDept(int parentDept) {
		this.parentDept = parentDept;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "DepartmentDto [deptCode=" + deptCode + ", deptName=" + deptName + ", comCode=" + comCode + ", wpCode="
				+ wpCode + ", parentDept=" + parentDept + ", del=" + del + "]";
	}

}
