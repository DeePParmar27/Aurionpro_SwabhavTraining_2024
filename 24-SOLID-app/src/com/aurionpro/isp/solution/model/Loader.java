package com.aurionpro.isp.solution.model;


public class Loader implements Iworker {

	@Override
	public void eat() {
		System.out.println("worker is Eating");
		
	}

	@Override
	public void rest() {
		System.out.println("worker is Resting");

		
	}

	@Override
	public void start() {
		System.out.println("worker is has Started");

		
	}

	@Override
	public void stop() {
		System.out.println("worker has Stoped");

	}

	

}
