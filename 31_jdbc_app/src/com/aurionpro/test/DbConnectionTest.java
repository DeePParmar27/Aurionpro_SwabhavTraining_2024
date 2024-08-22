package com.aurionpro.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.model.DbConnection;

public class DbConnectionTest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		DbConnection connect = new DbConnection();
		connect.connectToDatabase();
		

		int option ;
	
do {
	
	System.out.println("Choose The Operation :");
	System.out.println("1. Read");
	System.out.println("2. Create");
	System.out.println("3. Update");
	System.out.println("4 . Delete");
	
	option = sc.nextInt();
		switch(option) {
		case 1:
			connect.getStudentDetails();
			break ;
		case 2:
			connect.addStudent();
			break;
		case 3:
			connect.updateStudent();
			break ;
		case 4:
			connect.deleteStudent();
			break;
		default:
			System.out.println("Enter Valid Input");
		}
}while(option != 5);
		
	}
}

