package com.aurionpro.model;

public class Circle implements Shape  {

	
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	} 


	@Override
	public void area() {
System.out.println("The radius of circle is :"+ (3.14*radius*radius));
	}



}
