package com.aurionpro.test;
import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :-");
		int number =  sc.nextInt();
		
		if(number > 0) {
			System.out.println("The Number Entered is Positive");
		}
		else if(number < 0) {
			System.out.println("The Number Entered is Negative");
		}
		else
		{
			System.out.println("The number Entered is Zero");
		}
		
	}

}
