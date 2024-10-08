package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class StudentTest {
	
	IStudentService studentService ;
	
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
		Mockito.when(studentService.getTotalmark()).thenReturn(650);
		Mockito.when(studentService.getNumberOfSubject()).thenReturn(10);
	}

	@Test
	void testStudentCalculator() {		
		Student student = new Student(studentService);
		assertEquals(65, student.studentCalculator());
	}

}
