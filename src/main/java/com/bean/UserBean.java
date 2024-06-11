package com.bean;

public class UserBean {
	private String firstName, password, email;
	
	UserBean(){}
	
	public UserBean(String firstName, String password, String email) {
		this.firstName = firstName;
		this.password = password;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
