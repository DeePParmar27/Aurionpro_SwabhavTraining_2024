package com.aurionpro.list.model;

import java.util.Comparator;

public class studentsNameComparator  implements Comparator<Students>{

	@Override
	public int compare(Students student1, Students student2) {
		// TODO Auto-generated method stub
	       return student1.getName().compareTo(student2.getName());
	}
	

}
