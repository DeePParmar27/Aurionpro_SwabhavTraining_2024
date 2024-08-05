package com.aurionpro.model;

public class CreditCardPayment extends Payment {

	@Override
	public void payBill() {
	System.out.println("PAyBill For Credit Card Paymnet");
		
	}

	@Override
	public void redeem() {
		System.out.println("Please Reedem the amount");
	
	}

}
