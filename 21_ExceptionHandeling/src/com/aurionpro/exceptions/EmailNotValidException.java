package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException{
	
	public String getMessage() {
		return "Enter A valid Email" ;
	}

}
