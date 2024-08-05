package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape ;
		shape= new Circle(12);
		shape.area();
		
		shape = new Rectangle(12, 12);
		shape.area();
	}

}
