package com.aurionpro.srp.solution.model;

public class taxPrinter {
	private inVoice invoice ;
	private taxCalculator taxcalculator ;
	
	
	
	public taxPrinter(inVoice invoice, taxCalculator taxcalculator) {
		super();
		this.invoice = invoice;
		this.taxcalculator = taxcalculator;
	}



	public void invoice() {
		System.out.println("ID :"+invoice.getId());
		System.out.println("Amount :"+invoice.getAmount());
		System.out.println("Description :"+invoice.getDescription());
		System.out.println("Tax :"+invoice.getTax());
		System.out.println("Tax Amount :"+taxcalculator.calculateTax());
		System.out.println("Total Amount With Tax :"+(taxcalculator.calculateTax()+invoice.getAmount()));
	}

}
