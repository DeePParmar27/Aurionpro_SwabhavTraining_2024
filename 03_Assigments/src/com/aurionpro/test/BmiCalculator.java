package com.aurionpro.test;
import java.util.Scanner;
public class BmiCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your weight in Kg :-");
		double weight  = sc.nextDouble();
		
		System.out.println("Enter your Height in cm");
		double height = sc.nextDouble();
		
		double BMI = weight/(height*height)*10000;
		System.out.println("BMI of your body is:-"+BMI);
	}

}
