package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	
	
	Connection connect = null ;
	Statement statement = null ;
	PreparedStatement preparedStatement = null ;
	
	
	public void connectTodb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			 statement = connect.createStatement();
				System.out.println("Connected to Database Succesfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void employeeDetail() {
		try {
			ResultSet employeeData  = statement.executeQuery("SELECT * FROM employee");
			while(employeeData.next()) {
				System.out.println(employeeData.getInt(1)+"\t\t"+employeeData.getString(2)+"\t\t"+employeeData.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addEmployee() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int empID = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee Salary:");
		int salary = sc.nextInt();
		
		try {
			preparedStatement = connect.prepareStatement("insert into employee values(?,?,?)");
			preparedStatement.setInt(1, empID);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, salary);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void updateEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of employee you want to update :");
		int empID = sc.nextInt();
		System.out.println("Update the salary amount:");
		int salary = sc.nextInt();
		try {
			preparedStatement = connect.prepareStatement("update employee set salary = (?) where empid = (?)");
			preparedStatement.setInt(1, salary);
			preparedStatement.setInt(2, empID);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		try {
			preparedStatement = connect.prepareStatement("delete from employee where empid = (?)");
			System.out.println("Enter ID of employee you want to delete :");
			int empID = sc.nextInt();
			preparedStatement.setInt(1, empID);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
