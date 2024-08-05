package com.aurionpro.test;
import  java.util.Scanner;

public class DistanceFormula {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter X1 and Y1");
	   
	   System.out.print("Enter X1:-");
	   int x1 = sc.nextInt();
	   
	   System.out.print("Enter Y1:-");
	   int y1 = sc.nextInt();
	   
	   System.out.println("Enter X2 and Y2");
	   
	   System.out.print("Enter X2:-");
	   int x2 = sc.nextInt();
	   
	   System.out.print("Enter Y2:-");
	   int y2 = sc.nextInt();
	   
	   double X = x2 - x1 ;
	   double Y = y2 - y1 ;
	   
	   
	   double Distance = Math.pow(X, 2) + Math.pow(Y, 2);
	   double DistanceFormula = Math.pow(Distance, 0.5) ;
	   
	   System.out.println(DistanceFormula);
	}

}
