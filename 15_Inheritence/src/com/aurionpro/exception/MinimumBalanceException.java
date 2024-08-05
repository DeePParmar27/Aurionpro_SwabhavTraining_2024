package com.aurionpro.exception;

public class MinimumBalanceException extends Exception {

	public String getMessage() {
		return "Cannot Withdraw. Maintain minimum Balance ";
	}
}
