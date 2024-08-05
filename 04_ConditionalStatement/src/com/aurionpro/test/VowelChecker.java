package com.aurionpro.test;
import java.util.Scanner;

public class VowelChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a character :");
	char Checker =  sc.nextLine().charAt(0);
	
	
	if(Checker == 'A'|| Checker=='E' || Checker=='I'|| Checker=='O' || Checker=='U' ) {
		System.out.println("It is a vowel");
	}else {
		System.out.println("It is not a vowel");
	}
	
	
	
}
}
