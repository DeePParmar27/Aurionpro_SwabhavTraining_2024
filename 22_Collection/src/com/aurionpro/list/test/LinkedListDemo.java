package com.aurionpro.list.test;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<Integer> numbers = new LinkedList<>();
    numbers.add(10);
    numbers.addFirst(12);
    numbers.addLast(90);
    
    numbers.toArray();
    System.out.println(numbers);
    
    
    
}
}
