package com.aurionpro.test;

import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment ;
		payment = new CreditCardPayment();
		payment.payBill();
	}

}
