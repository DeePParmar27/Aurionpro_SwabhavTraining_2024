package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentComparator {
	
	public static class studentIdComparator implements Comparator<Students> {

		@Override
		public int compare(Students student1, Students student2) {

			return student1.getId() - student2.getId();
		}

	}

	public static class studentsNameComparator implements Comparator<Students> {

		@Override
		public int compare(Students student1, Students student2) {
			// TODO Auto-generated method stub
			return student1.getName().compareTo(student2.getName());
		}

	}

	public static class studentsPercentageComparator implements Comparator<Students> {

		@Override
		public int compare(Students student1, Students student2) {
			// TODO Auto-generated method stub
			if (student1.getRollNo() > student2.getRollNo()) {
				return 1;
			}
			if (student1.getRollNo() < student2.getRollNo()) {
				return -1;
			}
			return 0;
		}

	}

}
