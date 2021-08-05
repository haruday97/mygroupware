package bit.com.a.dto;

import java.io.Serializable;

public class WorkplaceDto implements Serializable{
	
	private int wpCode;
	private String wpName;
	private String wpRep;
	private String wpTel;
	private int comCode;
	private int del;
	
	public WorkplaceDto() {
		// TODO Auto-generated constructor stub
	}

	public WorkplaceDto(int wpCode, String wpName, String wpRep, String wpTel, int comCode, int del) {
		super();
		this.wpCode = wpCode;
		this.wpName = wpName;
		this.wpRep = wpRep;
		this.wpTel = wpTel;
		this.comCode = comCode;
		this.del = del;
	}

	public int getWpCode() {
		return wpCode;
	}

	public void setWpCode(int wpCode) {
		this.wpCode = wpCode;
	}

	public String getWpName() {
		return wpName;
	}

	public void setWpName(String wpName) {
		this.wpName = wpName;
	}

	public String getWpRep() {
		return wpRep;
	}

	public void setWpRep(String wpRep) {
		this.wpRep = wpRep;
	}

	public String getWpTel() {
		return wpTel;
	}

	public void setWpTel(String wpTel) {
		this.wpTel = wpTel;
	}

	public int getComCode() {
		return comCode;
	}

	public void setComCode(int comCode) {
		this.comCode = comCode;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "WorkplaceDto [wpCode=" + wpCode + ", wpName=" + wpName + ", wpRep=" + wpRep + ", wpTel=" + wpTel
				+ ", comCode=" + comCode + ", del=" + del + "]";
	}

}
