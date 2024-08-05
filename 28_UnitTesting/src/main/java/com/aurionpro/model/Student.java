package com.aurionpro.model;

public class Student {
	
	IStudentService studentService ;
	
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}



	public double studentCalculator() {
		return studentService.getTotalmark()/studentService.getNumberOfSubject();
	}

}
