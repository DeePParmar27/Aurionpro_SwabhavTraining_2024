package com.aurionpro.model;

public class Operation {

	public int addition(int a , int b) {
		return a + b ;
	}
	
	public int subtraction(int a , int b) {
		return a - b ;
	}
	
	public int[] squareOfArray(int numbers[]) {
		for(int i = 0 ; i < 3 ; i++) {
			numbers[i] = numbers[i]*numbers[i];
		}
		return numbers;
		
	}
	
	
	public boolean isEven(int number) {
		return number%2 == 0 ;
	}
	
	public int division(int number1 ,int number2) {
		if(number2 == 0 )
			throw new ArithmeticException();
		return number1/number2 ;
	}
	
}
