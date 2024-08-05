package com.aurionpro.dip.solution.model;

public class TaxCalulator {
	
	Ilogger logger ;
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

	
	
	public Ilogger getLogger() {
		return logger;
	}
	public void setLogger(Ilogger logger) {
		this.logger = logger;
	}
	public TaxCalulator(Ilogger logger) {
		super();
		this.logger = logger;
	}
	
	public void calculateTax(int amount , int rate ) {
		int tax = 0 ;
		try {
			tax = amount / rate ;
			System.out.println(tax);
			
		}catch (Exception e) {
			logger.log(" Divided By Zero");
		}
	}

}
