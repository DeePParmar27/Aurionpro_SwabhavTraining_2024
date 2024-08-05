package com.aurionpro.model;

public  class Circle extends Shape {
	
	
	private int radius ;
	
	public Circle(int radius) {
		this.radius = radius;
	}


	@Override
	public void area() {
		System.out.println("The area of Circle is :" +(3.14 * radius * radius));
	}

	

	
}
