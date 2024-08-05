package com.aurionpro.test;
import java.util.*;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Digit :");
	
	int revNum = 0 ;
	int dig = sc.nextInt() ;
	int temp =  dig ;
	
	while(dig > 0) {
		int lastDig = dig%10;
		revNum = revNum*10 + lastDig ;
		dig = dig/10 ;
	}
	
	if(revNum == temp) {
		System.out.println("The Number is Palindrom");
	}
	else
	{
		System.out.println("It is not a Palindrom");
	}
	System.out.println("The Reverse of Number is : "+revNum);
	
	
}
}
