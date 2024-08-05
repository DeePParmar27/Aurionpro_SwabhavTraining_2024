package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BI_Consumer {
public static void main(String[] args) {
	BiConsumer<Integer, Integer>  biconsumer = (Integer number1 , Integer number2) -> System.out.println("The addition of Two number is "+(number1 + number2));
    
	biconsumer.accept(12, 3);

}
}
