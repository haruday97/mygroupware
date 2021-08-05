package bit.com.a.dto;

public class UserDto {
	
	// SEQ
	private int userNo;
	
	// user commons Information
	private String userPw;
	private String userName;
	private String userEmail;
	private String userTel;
	private String userAddress;
	private String userPhone;
	
	// working-day info
	private String userHireDate;
	private String userEndDate;
	private String userCurrWork;
	
	// work infra info
	private int deptCode;
	private int jobCode;
	private int comCode;
	private int wpCode;
	
	// 권한설정
	private int userAuth;
	
	public UserDto() {
	
	}
	
	// Constructor Setting - 각자 추가나 수정필요 시 반드시 먼저 문의할 것
	public UserDto(int userNo, String userPw, String userName, String userEmail, String userTel, String userAddress,
			String userPhone, String userHireDate, String userEndDate, String userCurrWork, int deptCode, int jobCode,
			int comCode, int wpCode, int userAuth) {
		super();
		this.userNo = userNo;
		this.userPw = userPw;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userTel = userTel;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userHireDate = userHireDate;
		this.userEndDate = userEndDate;
		this.userCurrWork = userCurrWork;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.comCode = comCode;
		this.wpCode = wpCode;
		this.userAuth = userAuth;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserHireDate() {
		return userHireDate;
	}

	public void setUserHireDate(String userHireDate) {
		this.userHireDate = userHireDate;
	}

	public String getUserEndDate() {
		return userEndDate;
	}

	public void setUserEndDate(String userEndDate) {
		this.userEndDate = userEndDate;
	}

	public String getUserCurrWork() {
		return userCurrWork;
	}

	public void setUserCurrWork(String userCurrWork) {
		this.userCurrWork = userCurrWork;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public int getJobCode() {
		return jobCode;
	}

	public void setJobCode(int jobCode) {
		this.jobCode = jobCode;
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

	public int getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(int userAuth) {
		this.userAuth = userAuth;
	}

	@Override
	public String toString() {
		return "UserDto [userNo=" + userNo + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userTel=" + userTel + ", userAddress=" + userAddress + ", userPhone=" + userPhone
				+ ", userHireDate=" + userHireDate + ", userEndDate=" + userEndDate + ", userCurrWork=" + userCurrWork
				+ ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", comCode=" + comCode + ", wpCode=" + wpCode
				+ ", userAuth=" + userAuth + "]";
	}
	
}
