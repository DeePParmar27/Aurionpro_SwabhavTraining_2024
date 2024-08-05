package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter Your Roll NUmber");
		int r = sc.nextInt() ;
		s.setRoll(r);
		
		System.out.println("Enter Your Name");
		String n = sc.next();
		s.setName(n);
		
		System.out.println("Enter Your age");
		int a = sc.nextInt() ;
		s.setAge(a);
		
		System.out.println("Enter Your Percentage");
		double p = sc.nextDouble() ;
		s.setPercentage(p);
		
		System.out.println("student name is :"+s.getName());
		System.out.println("student rollNmber is :"+s.getRoll());
		System.out.println("student age is :"+s.getAge());
		System.out.println("student percentage is :"+s.getPercentage());
		
		char grade = 'A' ;
		if(s.getPercentage() >= 75) {
			grade = 'A' ;
		}
		else if(s.getPercentage() < 75 && s.getPercentage() >= 60) {
			grade = 'B';
		}
		else if(s.getPercentage() < 60 && s.getPercentage() >= 50) {
			grade = 'C';
		}
		else if(s.getPercentage() < 50 && s.getPercentage() >= 40) {
			grade = 'D';
		}
		else if(s.getPercentage() < 40) {
			grade = 'F';
		}
		
		System.out.println("The Grade of Student is :"+grade);
		
	}

}
