package com.aurionpro.model;

import com.aurionpro.exceptions.EmailNotValidException;

public class Login {
	
	private String email ;
	private String password ;
	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void emailValidator(String email) {
		if(!email.contains("@") || !email.contains(".")) {
	    	throw new EmailNotValidException();
	    }
	}
	
	

}
