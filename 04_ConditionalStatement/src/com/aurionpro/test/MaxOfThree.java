package com.aurionpro.test;
import java.util.Scanner;

import java.util.Scanner;

public class MaxOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 :-");
		int number1 = sc.nextInt() ;
		
		System.out.println("Enter Number 2 :-");
		int number2 = sc.nextInt() ;
		
		System.out.println("Enter Number 3 :-");
		int number3 = sc.nextInt() ;
		
		int max = number1 ;
		
		if(number2 > max) {
			max = number2 ;
			System.out.println("Number2 is greater");
		}
		else if(number3 >max) {
			max = number3 ;
			System.out.println("Number3 is Greater");
		}
		else {
			System.out.println("Number1 is greater");
		}
		
		
		
		
		
		
		
	}

}
