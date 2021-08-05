package bit.com.a.dto;

import java.io.Serializable;

public class JobDto implements Serializable{
	private int jobCode;
	private String jobPosition;
	private String jobTitle;
	private int del;
	
	public JobDto() {
		// TODO Auto-generated constructor stub
	}

	public JobDto(int jobCode, String jobPosition, String jobTitle, int del) {
		super();
		this.jobCode = jobCode;
		this.jobPosition = jobPosition;
		this.jobTitle = jobTitle;
		this.del = del;
	}

	public int getJobCode() {
		return jobCode;
	}

	public void setJobCode(int jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "JobDto [jobCode=" + jobCode + ", jobPosition=" + jobPosition + ", jobTitle=" + jobTitle + ", del=" + del
				+ "]";
	}
	
}
