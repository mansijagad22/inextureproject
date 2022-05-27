package form;

import javax.persistence.Entity;

@Entity(name=  "Person-form")
public class PersonForm {

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
	
	public PersonForm() {
		super();
	}
	public PersonForm(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "PersonForm [userName=" + userName + ", passWord=" + passWord + "]";
	}

   
}
