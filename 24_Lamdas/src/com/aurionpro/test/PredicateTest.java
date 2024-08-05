package com.aurionpro.test;

import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	
	//-Takes one arguments as input and Return Boolean Value 
	Predicate<Integer> evenCheker = (Integer number1) -> (number1 % 2 == 0) ;
	System.out.println(evenCheker.test(2));
}
}
