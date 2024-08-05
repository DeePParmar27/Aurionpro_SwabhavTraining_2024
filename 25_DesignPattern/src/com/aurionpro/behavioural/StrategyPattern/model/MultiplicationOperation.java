package com.aurionpro.behavioural.StrategyPattern.model;

public class MultiplicationOperation implements IOperation{

	@Override
	public void doOperation(int a, int b) {
		System.out.println("The multiplication is : "+(a*b));
		
	}
	

}
