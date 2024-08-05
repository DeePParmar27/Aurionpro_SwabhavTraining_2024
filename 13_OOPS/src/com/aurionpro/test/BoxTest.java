package com.aurionpro.test;

import java.util.*;
import com.aurionpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Box box1 = new Box(12 , 12 , 12);
		
//		System.out.println("Enter heigth:");
//		int h1 = sc.nextInt();
//		box1.setHeight(h1);
//		
//		System.out.println("Enter width");
//		int w1= sc.nextInt();
//		box1.setWidth(w1);
//		
//		System.out.println("Enter heigth:");
//		int d1 = sc.nextInt();
//		box1.setDepth(d1);

		System.out.println("The Volume of box1 :" + box1.calculateVolume());

		Box box2 = new Box(10 , 13 , 14);

//		System.out.println("Enter heigth:");
//		int h = sc.nextInt();
//		box2.setHeight(h);
//		
//		System.out.println("Enter width");
//		int w= sc.nextInt();
//		box2.setWidth(w);
//		
//		System.out.println("Enter heigth:");
//		int d = sc.nextInt();
//		box2.setDepth(d);
		
		
		System.out.println("The Volume of box2 :" + box2.calculateVolume());

	}

}
