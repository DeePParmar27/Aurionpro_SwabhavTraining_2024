package com.aurionpro.model;

public class Rectangle extends Shape {

	
	private int length ;
	private int bredth ;
	
	
	public Rectangle(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of Rectangel :"+(length*bredth));
		
	}

}
