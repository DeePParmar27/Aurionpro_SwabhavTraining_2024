package com.aurionpro.model;

 public class Demo {
	
	private int a = 1 ;
	static private int b = 1 ; //remains at same memory
	private int c = 1 ;
	
	public void incrementer() {
		a++;
		b++;
		c++;
		
	}

	public void display() {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("c :"+c);		
	}
	
	static
	{
		System.out.println("This is demo class");
	}
	
}
