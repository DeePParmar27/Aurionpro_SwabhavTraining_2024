package com.aurionpro.test;
import java.util.Scanner ;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit :");
		
		int sum = 0 ;
		int dig = sc.nextInt() ;
		
		
		while(dig > 0) {
			int lastDig = dig%10 ;
			sum = sum + lastDig ;
			dig = dig/10 ;
		}
		
		System.out.println(sum);
	}

}
