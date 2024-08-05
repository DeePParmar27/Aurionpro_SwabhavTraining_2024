package com.aurionpro.dip.violation.model;

public class TaxCalculator {
	
	DBlogger logger = new DBlogger() ;
	private int amount ;
	private int rate ;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public TaxCalculator() {

	}
	

	public void calculateTax(int amount , int rate) {
		int tax = 0 ;
		try {
			tax = amount / rate ;
			System.out.println(tax);
			
		}catch (Exception e) {
			logger.log("Divided By Zero");
		}
	}
				

	
	
	

}
