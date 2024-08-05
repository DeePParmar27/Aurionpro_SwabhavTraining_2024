package com.aurionpro.srp.solution.model;

public class taxCalculator {
	
	private inVoice invoice ;
	
	

	public taxCalculator(inVoice invoice) {
		this.invoice = invoice;
	}



	public double calculateTax() {
		return invoice.getAmount()*invoice.getTax()/100 ;
	}
}
