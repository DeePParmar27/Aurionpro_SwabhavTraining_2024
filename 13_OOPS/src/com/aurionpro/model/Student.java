package com.aurionpro.model;

public class Student{

	private int rollNumber;
	private String name ;
	private int age ;
	private double percentage ;
	
	public void setRoll(int r) {
	 rollNumber = r ;
	}
	
	public void setName(String n) {
		name = n ;
	}
	
	public void setAge(int a ) {
		 age = a ;
		}
	
	public void setPercentage(double p) {
		 percentage =  p  ;
	}
	
	public int getRoll() {
		return rollNumber ;
	}
	
	public String getName() {
		return name ;
	}
	
	public int getAge() {
		return age ;
	}
	
	public double getPercentage() {
		return percentage ;
	}
	
}
