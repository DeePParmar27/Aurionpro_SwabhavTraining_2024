package com.aurionpro.test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (Integer number) -> System.out.println("The square of number is :" +number*number);
		consumer.accept(9);
		//--Takes one i/p parameter and return no values ;
		
	}

}
