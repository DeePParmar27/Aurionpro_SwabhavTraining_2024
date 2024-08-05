package com.aurionpro.test;
import java.util.Scanner;

public class MultiMethod {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a :");
	int a = sc.nextInt() ;
	
	System.out.println("Enter b :");
	int b = sc.nextInt() ;
	
	Subtraction(a, b);
	
	
	
}

public static void Addition(int a , int b) {
	System.out.println("The Addition is :"+(a+b));
	// return a + b ;
}

public static void Subtraction(int x , int y) {
	System.out.println("The Subtraction is : "+(x - y)); 
	Addition(x, y);
	Multiplication(x, y);
}

public static void Multiplication(int x , int y) {
	System.out.println("The Multiplication is : "+(x * y)); 
	Division(x, y);
	
}

public static void Division(int x , int y) {
	System.out.println("The Division is : "+(x / y)); 

	
}

}
