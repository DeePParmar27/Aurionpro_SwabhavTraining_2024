package com.aurionpro.exceptions;

public class VoterAgeException extends RuntimeException {
	

	private int age ;
	public VoterAgeException(int age) {
		super();
		this.age = age;
	}


	public String getMessage() {
	     return "Age should more than 18 : "+age;
	}

}
