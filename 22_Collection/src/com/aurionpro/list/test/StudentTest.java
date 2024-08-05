package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.StudentComparator;
import com.aurionpro.list.model.Students;
import com.aurionpro.list.model.studentIdComparator;
import com.aurionpro.list.model.studentsNameComparator;
import com.aurionpro.list.model.studentsPercentageComparator;

public class StudentTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Students> students = new ArrayList<Students>();

		// for(int i= 0 ; i < 2 ;i++) {
		// System.out.println("Enter ID :");
		// int id = sc.nextInt() ;
		// System.out.println("Enter name :");
		// String name = sc.next() ;
		// System.out.println("Enter Percentage :");
		// int percentage = sc.nextInt() ;
		// students.add(new Students(id, name, percentage));
		// }

		students.add(new Students(2, "Deep", 90));
		students.add(new Students(4, "Shubham", 80));
		students.add(new Students(1, "Nihal", 70));
		students.add(new Students(3, "Abhay", 95));
		students.add(new Students(5, "Krish", 65));

		displayStudents(students);

		// Collections.sort(students,new studentsPercentageComparator());
		 Collections.sort(students, new StudentComparator.studentIdComparator());
		//Collections.sort(students, new studentsNameComparator());

		System.out.println("Students After sorting :");
		System.out.println("");
		displayStudents(students);

	}

	private static void displayStudents(List<Students> students) {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

	}

}
