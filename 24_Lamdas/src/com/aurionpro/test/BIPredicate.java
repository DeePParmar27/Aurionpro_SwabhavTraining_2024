package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BIPredicate {
public static void main(String[] args) {
	BiPredicate<Integer,Integer>  numberGreaterChecker = (Integer number1 , Integer number2) -> (number1 > number2) ;
	
	
	boolean res = numberGreaterChecker.test(15, 13) ;
	if(res == true) {
		System.out.println("Number1 is greater Than Number2");
	    return ;
	    }
	System.out.println("Number2 is greater Than Number1");
	
	
}
}
