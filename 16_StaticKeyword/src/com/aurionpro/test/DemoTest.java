package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {
	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		demo1.display();
		demo1.incrementer();
		demo1.display();
		
		System.out.println("--------------------------------");
		
		Demo demo2 = new Demo();
		demo2.display();
		demo2.incrementer();
		demo2.display();
		
		System.out.println("----------------------------------");
		
		Demo demo3 = new Demo();
		demo3.display();
		demo3.incrementer();
		demo3.display();	
	}
}
