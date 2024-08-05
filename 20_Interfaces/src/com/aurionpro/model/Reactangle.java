package com.aurionpro.model;

public class Reactangle implements Shape {
	
public int length ;

public int height ;

public Reactangle(int length, int height) {
	super();
	this.length = length;
	this.height = height;
}

@Override
public void area() {
	// TODO Auto-generated method stub
	System.out.println("The area Rectangle is :"+(length*height));
}


}
