package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class employeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.connectTodb();
		employee.employeeDetail();
		
//		employee.addEmployee();
//		employee.employeeDetail();
//		employee.deleteEmployee();
//		employee.employeeDetail();
		
		employee.updateEmployee();
		employee.employeeDetail();
	}

}
