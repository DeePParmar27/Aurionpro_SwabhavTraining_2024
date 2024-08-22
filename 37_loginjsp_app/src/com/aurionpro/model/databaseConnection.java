package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {
	
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null ;
	
	public void connectToDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
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
	
	public ResultSet getAllresult() {
		
		ResultSet res = null ;
		
		try {
			res = statement.executeQuery("SELECT * FROM user ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res ;
	}
	
	public boolean validateCredentail(String username , String password) {
		
		ResultSet dbres = getAllresult() ;
		try {
			while(dbres.next()) {
				if(dbres.getString("username").equals(username))
					if(dbres.getString("password").equals(password))
						return true ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
		
	}

}
