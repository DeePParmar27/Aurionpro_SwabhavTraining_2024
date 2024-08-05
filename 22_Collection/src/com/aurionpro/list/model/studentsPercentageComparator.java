package com.aurionpro.list.model;

import java.util.Comparator;

public class studentsPercentageComparator implements Comparator<Students> {

	@Override
	public int compare(Students student1, Students student2) {
		// TODO Auto-generated method stub
		if(student1.getRollNo() > student2.getRollNo()) {
			return 1;
		}
		if(student1.getRollNo() < student2.getRollNo()) {
			return -1;
		}
		return 0;
	}
	
	

}
