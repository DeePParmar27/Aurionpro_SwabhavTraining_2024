package com.aurionpro.test;
import java.util.*;
public class NumberGusser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double randNum = Math.floor( Math.random()*100 );
	System.out.println(randNum);
	
	// System.out.println("Enter the Number :");	
	int count = 0 ;

	while(true) {
	System.out.println("Enter the Number :");		
	double guessNum = sc.nextInt();
	if(guessNum == randNum) {
		count++ ;
		System.out.println("You won in :"+count+" attempts");
		break;
	}
	else {
		if(guessNum < randNum ) {
			System.out.println("It is too less");
     		count++;
		}else {
			System.out.println("It is too High");
			count++ ;
		}
	}
	}
	
}
}
