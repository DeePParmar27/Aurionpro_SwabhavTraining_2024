package com.aurionpro.srp.voilation.test;

import com.aurionpro.srp.voilation.model.inVoice;

public class invoiceTest {
	public static void main(String[] args) {
		inVoice invoice = new inVoice("1", "Invoice Tax", 1000, 10);
		invoice.invoice();
	}

}
