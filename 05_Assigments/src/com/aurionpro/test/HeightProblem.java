package com.aurionpro.test;
import java.util.*;

public class HeightProblem {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Height in cm");
		int height = sc.nextInt();
		
		if(height > 120) {
			System.out.println("Can Ride");
			System.out.println("Enter your age :");
			int age = sc.nextInt();
			System.out.println("Do you want Photo :");
			String photo = sc.next();
			if(age < 12) {
				if(photo.equals("yes")){
					System.out.println("The Total Bill is $:"+(5+3));
				}
				else  {
					System.out.println("The Total Bill is $:"+5);
				}
			}
			if(age < 18  && age >= 12) {
				if(photo.equals("yes")) {
					System.out.println("The Total Bill is $:"+(7+3));
				}
				else {
					System.out.println("The Total Bill is $:"+7);
				}
			}
			if(age >= 18 && age < 45 ) {
				if(photo.equals("yes")) {
					System.out.println("The Total Bill is $:"+(12+3));
				}
				else {
					System.out.println("The Total Bill is $:"+12);
				}
			}
			if(age >= 45 && age <= 55 ) {
				if(photo.equals("yes")) {
					System.out.println("The Total Bill is $:"+(0+3));
				}
				else {
					System.out.println("The Total Bill is $:"+0);
				}
			}
			
		}
}
}
