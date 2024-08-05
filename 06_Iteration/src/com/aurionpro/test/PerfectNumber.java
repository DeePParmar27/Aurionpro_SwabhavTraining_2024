package com.aurionpro.test;
import java.util.*;
public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter the Number :");
	int number = sc.nextInt();
	int temp = number ;
	int i = 1 ;
	int sum = 0 ;
	
	
	while (i <= number/2) {  // It is same as i == number
		if(number % i == 0) {
			sum = sum + i ;
			i++ ;
		}
		else {
			i++ ;
		}
	}
	if(sum == temp) {
		System.out.println("It is a perfect Number");
	}
	else {
		System.out.println("It is not a perfect number");
	}
	System.out.println("The sum of Divisor is :"+sum);
}
}
