package com.aurionpro.list.model;

import java.util.Comparator;

public class employeeComparator {

	public static class employeeIdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getEmpID() - employee2.getEmpID();
		}

	}

	public static class employeeSalaryComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getSalary() - employee2.getSalary();
		}

	}
	
	public static class employeeNameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			
			return employee1.getName().compareTo(employee2.getName());
		}
		
		
	}

}
