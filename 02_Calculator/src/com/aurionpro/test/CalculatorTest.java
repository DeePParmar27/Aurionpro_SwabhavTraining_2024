package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.Calculator;


public class CalculatorTest {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	 
	   
	  System.out.println("Enter a :");
	   int a  = sc.nextInt();
	   System.out.println("Enter b :");
	   int b = sc.nextInt() ;

	   System.out.println("The Addition of a AND b is: " +Calculator.Addition(a, b));
	   System.out.println("The Subtraction of a AND b is: " +Calculator.Subtraction(a,b));
	   System.out.println("The Multiplication of a AND b is: " +Calculator.Multiplication(a,b));
	   System.out.println("The Division of a AND b is: " +Calculator.Division(a,b));


	   
}
   



}
