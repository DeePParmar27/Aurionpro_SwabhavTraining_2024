package com.aurionpro.test;
import java.util.*;

public class FactorialCalculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number :");
	int number = sc.nextInt() ;
	
	int factorial = calculateFactorial(number);
	
	if(factorial == -1) {
		System.out.println("Cannot take factorial of Negative Number");
		return ;
	}
	
	System.out.println("Factorial : "+factorial);
}

private static int calculateFactorial(int number) {
	// TODO Auto-generated method stub
	int fact = 1;
	
	if(number == 0) {
		return 1;
	}
	if(number < 0) {
		return -1; 
	}
	
	for(int i = 1 ; i <= number ;i++) {
		fact = fact*i ;
	}
	return fact;
}
}
