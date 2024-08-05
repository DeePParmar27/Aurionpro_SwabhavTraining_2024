package com.aurionpro.list.model;

public class Employee {
	
	private int empID ;
	private String name ;
	private int salary ;
	public Employee(int empID, String name, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}

