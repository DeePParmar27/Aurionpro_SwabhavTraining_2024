package com.aurionpro.test;

import java.lang.reflect.Method;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> squareOfNumbers = (Integer number) -> number*number ;
		System.out.println("Square of Number is "+squareOfNumbers.apply(12));
		
		BiFunction<Integer, Integer , Integer> addtionOfNumber = (Integer number1 , Integer number2 ) -> (number1 + number2) ;
		method(addtionOfNumber);
		
	}

	private static void method(BiFunction<Integer, Integer, Integer> addtionOfNumber) {
		System.out.println(addtionOfNumber.apply(12, 12));	
		
	}

}
