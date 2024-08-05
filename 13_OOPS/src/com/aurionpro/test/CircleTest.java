package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The radius: ");
		int r = sc.nextInt();
	
		Circle c = new Circle(r);
		
		c.display();
		System.out.println("The area of circle : "+ c.area());
		
		

		
		
	}

}
