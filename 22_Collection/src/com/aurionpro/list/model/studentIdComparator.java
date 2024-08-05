package com.aurionpro.list.model;

import java.util.Comparator;

public class studentIdComparator implements Comparator<Students> {

	@Override
	public int compare(Students student1, Students student2) {
		

		return student1.getId() - student2.getId();
	}
	

}
