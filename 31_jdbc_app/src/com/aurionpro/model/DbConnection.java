package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class DbConnection {

	Connection connection = null ;
	Statement statement = null ;
	PreparedStatement prepardedStatement = null ;
	
	public void connectToDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			statement = connection.createStatement();
			System.out.println("Connected to Database Succesfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void getStudentDetails() {
		try {
			ResultSet dbStudentData = statement.executeQuery("SELECT * FROM STUDENTS");
			while(dbStudentData.next()) {
				System.out.println(dbStudentData.getInt(1)+"\t"+dbStudentData.getString(2)+"\t"+dbStudentData.getInt(3)+"\t"+dbStudentData.getDouble(4)+"\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo :");
        int rollNo = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter age :");
        int age = sc.nextInt();
        System.out.println("Enter Percentage :");
        double percentage = sc.nextDouble();
        
        try {
        	prepardedStatement = connection.prepareStatement("insert into students values (? , ? ,? , ?)");
        	prepardedStatement.setInt(1, rollNo);
        	prepardedStatement.setString(2, name);
        	prepardedStatement.setInt(3, age);
        	prepardedStatement.setDouble(4, percentage);
        	prepardedStatement.executeUpdate();
        	
//			statement.executeUpdate("insert into students values("+rollNo+","+"'"+name+"'"+","+age+","+percentage+")");
			System.out.println("Record Added Succefully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}
	
	public void updateStudent() {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage :");
        double percentage = sc.nextDouble();
        System.out.println("Enter RollNo :");
        int rollNo = sc.nextInt();
 
        
        try {
			prepardedStatement = connection.prepareStatement("update students set percentage = (?) where rollNo = (?)");
			prepardedStatement.setDouble(1, percentage);
			prepardedStatement.setDouble(2, rollNo);
            System.out.println("Updated Succesfully");
        	prepardedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno of Student you Want to remove :");
        System.out.println("Enter RollNo :");
        int rollNo = sc.nextInt();
        
        try {
			prepardedStatement = connection.prepareStatement("delete from students where rollNo = (?)");
			prepardedStatement.setInt(1, rollNo);
			prepardedStatement.executeUpdate();
            System.out.println("Updated Succesfully");
        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	public void tabelMetaData() throws SQLException {
		
		ResultSet result = statement.executeQuery("select * from students");
		try {
			ResultSetMetaData columns = result.getMetaData();
			  while(((ResultSet) columns).next()) {
				    String columnName = ((ResultSet) columns).getString("COLUMN_NAME");
				    String columnSize = ((ResultSet) columns).getString("COLUMN_SIZE");
				    String datatype = ((ResultSet) columns).getString("DATA_TYPE");
				    String isNullable = ((ResultSet) columns).getString("IS_NULLABLE");
				    String isAutoIncrement = ((ResultSet) columns).getString("IS_AUTOINCREMENT");
				  }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
