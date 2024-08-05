package com.aurionpro.test;
import java.util.*;

public class InputValidatorTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter Name :");
	String name = scanner.next();
	inputValidator(name, 3, 20);
	System.out.println("Enter Password :");
	String password = scanner.next();
	inputValidator(password, 8, 30);
	System.out.println("Enter Email :");
	String email = scanner.next();
	inputValidator(email, 5, 50);
	characterValidator(email);
	
	
	
}

private static void characterValidator(String email) {
	// TODO Auto-generated method stub
    if(!email.contains("@") && !email.contains(".")) {
    	System.out.println("Enetr Valid Password");
    }
	
}

private static void inputValidator(String name , int shortRange , int longRange) {
	// TODO Auto-generated method stub
	if(name.length() == 0 || name.length() < shortRange || name.length() >longRange ) {
		System.out.println("Enter a valid name");
		return ;
	}
	
}
}
