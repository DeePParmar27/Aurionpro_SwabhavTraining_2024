package com.aurionpro.isp.violation.model;

public class Labour implements Iworker {

	@Override
	public void startWork() {
		System.out.println("Labour Started the Work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Labour Stoped the Work");

	}

	@Override
	public void eat() {
		System.out.println("Labour is eating");

		
	}

	@Override
	public void drink() {
		System.out.println("Labour is Drinking ");		
	}
	

}
