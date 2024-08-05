package com.aurionpro.model;

public class Circle {
	
	private int radius ;
	
	
	public Circle(int radius){
		this.radius = radius ;
	}
	
//	public void radiusSetter(int radius) {
//		this.radius = radius ;
//	}
	
	public void display() {
		System.out.println("The radius of circle:"+radius);
	}
	
	public double area() {
		return 3.14*radius*radius ;
	}

}
