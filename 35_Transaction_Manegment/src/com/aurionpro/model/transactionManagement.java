package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class transactionManagement {
	public static void main(String[] args) {
		Connection connection = null ;
		PreparedStatement preparedStatement = null ;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
			connection.setAutoCommit(false);
			
			preparedStatement = connection.prepareStatement("UPDATE account SET balance = balance - ? WHERE accountNumber = ?");
			preparedStatement.setInt(1, 200);
			preparedStatement.setInt(2, 1);
			preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareStatement("UPDATE account SET balance = balance + ? WHERE accountNumber = ?");
			preparedStatement.setInt(1, 200);
			preparedStatement.setInt(2, 2);
			preparedStatement.executeUpdate();
			
			
			connection.commit();
			System.out.println("Transaction Succefull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
