package com.aurionpro.model;

public class FourWheeler extends Vehicle {

	private double milage ;
	
	
	public FourWheeler(String companyName , double milage) {
		super(companyName);
		this.milage = milage;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}
	
}
