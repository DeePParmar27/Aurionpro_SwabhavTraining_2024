package com.aurionpro.test;
import java.util.Scanner;

public class MaxOfTwo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number 1 :-");
	int number1 = sc.nextInt() ;
	
	System.out.println("Enter Number 2 :-");
	int number2 = sc.nextInt() ;
	
	if(number1 > number2) {
		System.out.println("Number 1 is Greater");
	}
	else if(number2 > number1) {
		System.out.println("Number 2 is Greater");
	}
	else {
		System.out.println("Number1 and Number2 are Equal");
	}
	
}
}
