package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.employeeComparator;

public class employeeTest {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee(2, "Deep", 100000));
		employee.add(new Employee(5, "Suhas", 90000));
		employee.add(new Employee(3, "Subodh", 80000));
		employee.add(new Employee(1, "Tirth", 40000));
		employee.add(new Employee(4, "Nihal", 12000));
		
		//Collections.sort(employee , new employeeComparator.employeeIdComparator());
		Collections.sort(employee , new employeeComparator.employeeNameComparator().thenComparing(other));
		
		for(Employee employees : employee) {
			System.out.println(employees);
		}

	}

}
