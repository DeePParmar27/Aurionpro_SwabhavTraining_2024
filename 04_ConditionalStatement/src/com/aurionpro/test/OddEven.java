package com.aurionpro.test;
import java.util.Scanner ;

public class OddEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int number = sc.nextInt() ;
		
		if(number < 0) {
			System.out.println("Please Enter Positive Number");
		}
		else if(number % 2 == 0)
		{
			System.out.println("The Number Entered is Even");
		}
		else {
			System.out.println("The Number Entered is Odd");
		}
	}

}
