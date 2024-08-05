package com.aurionpro.test;
import java.util.*;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter the Number :"
			+ "");
	int number = sc.nextInt();
	int flag = 0 ;
	if(number <= 1) {
		// System.out.println("Not Prime");
		flag = 1 ;
	}
	int i = 2 ;


	while( i < number) {

		if(number%i == 0) {
             flag = 1 ;
             
		}
		i++;
	}
	
	
	if(flag == 0) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not Prime");
	}
		
}
}
