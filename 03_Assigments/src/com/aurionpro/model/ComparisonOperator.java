package com.aurionpro.model;

public class ComparisonOperator {
	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 10 ;
		
		if(num1 == num2)
		{
			System.out.println("Num1 and Num2 are Equal");
		}
		else if(num1 >= num2){
			System.out.println("Num1 is greater than Num2");
		}
		else if(num1 <= num2){
			System.out.println("Num2 is greater than Num1");
		}
	}

}
