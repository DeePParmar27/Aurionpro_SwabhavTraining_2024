package com.aurionpro.behavioural.Account.test;

public class insufficientBalanceException extends RuntimeException {

	public String getMessage() {
	
		return "There is insufficient Balance";
	}
	
}
