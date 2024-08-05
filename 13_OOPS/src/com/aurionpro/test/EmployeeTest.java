package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Employee employee1 = new Employee(123 , "Deep" , 130000);
		
	    employee1.display();
		
//		System.out.print("Enter Your Employee Id : ");
//		int empId = sc.nextInt() ;
//        employee1.setEmployeeId(empId);
//        
//		System.out.print("Enter Your Employee Name : ");
//		String empName = sc.next();
//        employee1.setName(empName);
//        
//		System.out.print("Enter Your Employee Salary : ");
//		int sal = sc.nextInt() ;
//        employee1.setSalary(sal);
        
        
//        System.out.println("EmployeeID : "+employee1.getEmployeeId());
//        System.out.println("The name of Employee is :"+employee1.getName());
//        System.out.println("Salary :"+employee1.getSalary());
        
    
        
        
        System.out.println("----------------------------------");
        Employee employee2 = new Employee(124 , "Krish" , 120000);
        
      
        
//        System.out.print("Enter Your Employee Id : ");
//		int empId2 = sc.nextInt() ;
//        employee2.setEmployeeId(empId2);
//        
//		System.out.print("Enter Your Employee Name : ");
//		String empName2 = sc.next();
//        employee2.setName(empName2);
//        
//		System.out.print("Enter Your Employee Salary : ");
//		int sal2 = sc.nextInt() ;
//        employee2.setSalary(sal2);
        
        
//        System.out.println("EmployeeID : "+employee2.getEmployeeId());
//        System.out.println("The name of Employee is :"+employee2.getName());
//        System.out.println("Salary :"+employee2.getSalary());
        
        employee2.display();
      

        
        
	}

}
