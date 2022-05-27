package model;

public class EmployeeLogin {

	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public EmployeeLogin(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public EmployeeLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeLogin [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
