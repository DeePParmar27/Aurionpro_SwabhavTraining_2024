package com.aurionpro.model;

public class Student extends Person {

	
	private int rollNO;
	private double percentage ;
	
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", percentage=" + percentage + ", Name=" + getName() + ", Age="
				+ getAge() + ", Address=" + getAddress() + " toString()=" + super.toString() + "]";
	}

	
}
