package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {
		
		IFactorial fact = (number) -> {
			int factorial = 1;
			for(int i = 1 ; i <= number ; i++) {
				factorial = factorial*i ;
			}
			return factorial;	
		};
		
		System.out.println(fact.factorial(5));
	}

}
