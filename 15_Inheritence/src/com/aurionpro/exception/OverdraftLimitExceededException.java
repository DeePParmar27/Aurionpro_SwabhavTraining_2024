package com.aurionpro.exception;

public class OverdraftLimitExceededException extends RuntimeException {

	public String getMessage() {
		return "Cannot Withdraw the Amount . Exceeds the OverDraftLimit " ;
	}
}
