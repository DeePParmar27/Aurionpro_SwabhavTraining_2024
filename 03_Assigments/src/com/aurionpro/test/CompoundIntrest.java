package com.aurionpro.test;
import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 
		
		System.out.print("Enter the principle Amount :-");
		double principle = sc.nextDouble();
		
		System.out.print("Enter Rate of Intrest :-");
		double Rate = sc.nextDouble();
		double RateOfIntrest = Rate/100 ;
		
		System.out.print("Enter Time Period:-");
		double time = sc.nextDouble();
		
    
		double CompoundIntrest = principle*Math.pow((1+RateOfIntrest), time) - principle ;
		System.out.println(CompoundIntrest);
	}

}
