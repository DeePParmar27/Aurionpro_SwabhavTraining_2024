package com.aurionpro.exceptions;

public class PasswordNotValidException extends Exception {
	
	public String getMessage() {
		return "Enter a valid password " ;
	}

}
