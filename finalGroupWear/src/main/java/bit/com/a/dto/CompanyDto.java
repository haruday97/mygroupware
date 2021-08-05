package bit.com.a.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable{
	
	private int comCode;
	private String comName;
	private String comRep;
	private String comTel;
	private int del;
	
	public CompanyDto() {
		// TODO Auto-generated constructor stub
	}

	public CompanyDto(int comCode, String comName, String comRep, String comTel, int del) {
		super();
		this.comCode = comCode;
		this.comName = comName;
		this.comRep = comRep;
		this.comTel = comTel;
		this.del = del;
	}

	public int getComCode() {
		return comCode;
	}

	public void setComCode(int comCode) {
		this.comCode = comCode;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComRep() {
		return comRep;
	}

	public void setComRep(String comRep) {
		this.comRep = comRep;
	}

	public String getComTel() {
		return comTel;
	}

	public void setComTel(String comTel) {
		this.comTel = comTel;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "CompanyDto [comCode=" + comCode + ", comName=" + comName + ", comRep=" + comRep + ", comTel=" + comTel
				+ ", del=" + del + "]";
	}

}
