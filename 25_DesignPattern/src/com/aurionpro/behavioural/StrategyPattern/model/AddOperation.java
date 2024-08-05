package com.aurionpro.behavioural.StrategyPattern.model;

public class AddOperation implements IOperation {

	@Override
	public void doOperation(int a, int b) {
		System.out.println("Additon is : "+(a+b));
		
	}

}
