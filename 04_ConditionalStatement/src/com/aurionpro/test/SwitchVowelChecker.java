package com.aurionpro.test;
import java.util.Scanner;

public class SwitchVowelChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a character :");
	char checker =  sc.nextLine().charAt(0);
	
	switch(checker) {
	case 'A':
		System.out.println("It is Vowel");
		break;
	case 'E':
		System.out.println("It is Vowel");
		break;
	case 'I':
		System.out.println("It is Vowel");
		break;
	case 'O':
		System.out.println("It is Vowel");
		break;
	case 'U':
		System.out.println("It is Vowel");
		break;
	default:
		System.out.println("It is not a vowel");
		
	}
}
}
