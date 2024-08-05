package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {
public static void main(String[] args) {
	
	Student student1 = new Student();
	
	student1.setName("Deep");
	student1.setAge(21);
	student1.setRollNO(24);
	student1.setAddress("Kandivali");
	student1.setPercentage(89);
	
	System.out.println(student1);
}
}
