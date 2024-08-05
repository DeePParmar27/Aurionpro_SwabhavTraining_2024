package com.aurionpro.model;

public class Refrence {
	
	public Refrence() {
		System.out.println("Inside Constuctor");
	}
	
	public static void staticPrint() {
		System.out.println("Inside Static");
	}
	
	public void nonStaticPrint() {
		System.out.println("Non Static");
	}

	@Override
	public String toString() {
		return "Refrence [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
