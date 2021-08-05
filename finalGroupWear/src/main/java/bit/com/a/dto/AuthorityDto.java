package bit.com.a.dto;

import java.io.Serializable;

public class AuthorityDto implements Serializable{
	
	private int userAuth;
	private String authName;
	private int optionA;
	private int optionB;
	private int optionC;
	private int del;
	
	public AuthorityDto() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthorityDto(int userAuth, String authName, int optionA, int optionB, int optionC, int del) {
		super();
		this.userAuth = userAuth;
		this.authName = authName;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.del = del;
	}

	public int getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(int userAuth) {
		this.userAuth = userAuth;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public int getOptionA() {
		return optionA;
	}

	public void setOptionA(int optionA) {
		this.optionA = optionA;
	}

	public int getOptionB() {
		return optionB;
	}

	public void setOptionB(int optionB) {
		this.optionB = optionB;
	}

	public int getOptionC() {
		return optionC;
	}

	public void setOptionC(int optionC) {
		this.optionC = optionC;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "AuthorityDto [userAuth=" + userAuth + ", authName=" + authName + ", optionA=" + optionA + ", optionB="
				+ optionB + ", optionC=" + optionC + ", del=" + del + "]";
	}
	
}
