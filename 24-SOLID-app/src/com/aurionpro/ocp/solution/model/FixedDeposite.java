package com.aurionpro.ocp.solution.model;


public class FixedDeposite {
	
	private int accountNumber ;
	private String name ;
	private double principle ;
	private int duration ;
	private IFestivalType intrestRate ;
	
	public FixedDeposite(int accountNumber, String name, double principle, int duration,IFestivalType intrestRate) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;		
		this.intrestRate = intrestRate ;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "FixedDeposite [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + "]";
	}
	

  
  public double simpleIntrest() {
	  double SI = principle*duration*intrestRate.getIntrestRate()/100 ;
	  return SI ;
  }

}
