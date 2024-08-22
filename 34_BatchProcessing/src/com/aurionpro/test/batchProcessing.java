package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class batchProcessing {
	public static void main(String[] args) throws SQLException {
		        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		        connection.setAutoCommit(false);
		        PreparedStatement statement = connection.prepareStatement("INSERT INTO STUDENTS VALUES (?, ? , ?  ,? )");

		        // Add multiple records to the batch
//		        statement.setInt(1, 8);
//		        statement.setString(2, "harsh");
//		        statement.setInt(3, 20);
//		        statement.setInt(4,96);
//		        statement.addBatch();
//
//		        statement.setInt(1, 9);
//		        statement.setString(2, "Ishan");
//		        statement.setInt(3, 22);
//		        statement.setInt(4,76);
//		        statement.addBatch();
		        
		        ResultSet RESULT = statement.executeQuery("SELECT * FROM STUDENTS");
				while(RESULT.next()) {
					System.out.println(RESULT.getInt(1)+"\t"+RESULT.getString(2)+"\t"+RESULT.getInt(3)+"\t"+RESULT.getDouble(4)+"\t");
				}
		        
		        

		        // Execute the batch
		        statement.executeBatch();
		        connection.commit();
		        connection.close();		
	}

}
