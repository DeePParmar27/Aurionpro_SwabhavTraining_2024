package com.aurionpro.ocp.violation.model;



public class FixedDeposite {
	public enum festivalType{
		NEWYEAR,
		DIWALI,
		HOLI,
		OTHER
	}
	
	private int accountNumber ;
	private String name ;
	private double principle ;
	private int duration ;
	private festivalType festival ;
	private double intrestRate ;
	public FixedDeposite(int accountNumber, String name, double principle, int duration, festivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	
		
	}
	
	





//	public double getIntrestRate() {
//		return intrestRate;
//	}


	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
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
	public festivalType getFestival() {
		return festival;
	}
	public void setFestival(festivalType festival) {
		this.festival = festival;
	}
	@Override
	public String toString() {
		return "FixedDeposite [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}
	
	
  public double getIntrestRates() {
	  if(festival == festivalType.NEWYEAR) {
		  setIntrestRate(8);
	  }
	  else if(festival == festivalType.DIWALI) {
		  setIntrestRate(8.5);
	  }	  else if(festival == festivalType.) {
		  setIntrestRate(7.5);
	  }else {
		  setIntrestRate(6.5);
	  }
	return intrestRate;
  }
  
  public double simpleIntrest() {
	  double SI = (principle*duration*getIntrestRates())/100 ;
	  return SI ;
  }
  
}
