package com.aurionpro.model;

public class Employee {
	
	private  int employeeID ;
	private String name ;
	private int salary ;
	
	
	public Employee(int empID , String name , int salary ) {
		employeeID = empID ;
		this.name = name ;
		this.salary = salary ;
	}
	
	public void setEmployeeId(int employeeID) {
		this.employeeID  = employeeID ;
	}
	
	public void setName(String name) {
		this.name  = name ;
	}
	
	public void setSalary(int salary) {
		this.salary  = salary ;
	}
	
	public int getEmployeeId() {
		return employeeID ;
	}
	
	public String getName() {
		return name ;
	}
	
	public int getSalary() {
		return salary ;
	}

	public void display() {
		System.out.println();
		System.out.println("Employee ID: "+getEmployeeId());
		System.out.println("Name: "+getName());
		System.out.println("Salary :"+getSalary());
	}
}
