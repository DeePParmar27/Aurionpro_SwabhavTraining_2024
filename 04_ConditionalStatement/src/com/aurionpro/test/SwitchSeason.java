package com.aurionpro.test;
import java.util.Scanner;

public class SwitchSeason {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the month number : ");
	int month = sc.nextInt();
	
	switch(month) {
	case 1:
		System.out.println("Winter");
		break;
	case 2:
	case 3:
	case 4:
	case 5:
		System.out.println("It is Summer Season");
		break;
	case 6:
	case 7:
	case 8:
	case 9:
		System.out.println("It is Monsoon Season");
		break;
	case 10:
	case 11:
	case 12:
		System.out.println("It is Winter Season");
		break ;
	}
	
}
}
