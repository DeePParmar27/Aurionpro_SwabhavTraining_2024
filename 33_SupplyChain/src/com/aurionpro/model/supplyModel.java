package com.aurionpro.model;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class supplyModel {
	
	
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null ;
	
	
	public void connectToDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parcel","root","root");
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
	
	
	public void getInventoryDetails() {
		try {
			ResultSet result = statement.executeQuery("select * from inventory");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getInt(2)+"\t"+result.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getOrderDetails() {
		try {
			ResultSet result = statement.executeQuery("select * from orderdetails");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getInt(2)+"\t"+result.getInt(3)+"\t"+result.getInt(4)+"\t"+result.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getOrders() {
		try {
			ResultSet result = statement.executeQuery("select * from orders");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getTimestamp(2)+"\t"+result.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getProducts() {
		try {
			ResultSet result = statement.executeQuery("select * from products");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getSupplier() {
		try {
			ResultSet result = statement.executeQuery("select * from suppliers");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query1() {
		try {
			ResultSet result = statement.executeQuery("select p.name , s.name from suppliers s join products p on s.SupplierID = p.supplierid"
);
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query2() {
		try {
		ResultSet result = statement.executeQuery("select p.ProductID, p.name,i.quantityonhand from products p  inner join  inventory i on i.productid = p.productid");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getInt(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query3() {
		try {
		ResultSet result = statement.executeQuery("select p.*,s.name from suppliers s join products p on s.SupplierID = p.supplierid where ProductID = 1");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getInt(4)+"\t"+result.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query4() {
		try {
		ResultSet result = statement.executeQuery("select o.orderid , p.name , od.quantity\r\n" + 
				"from orders  o\r\n" + 
				"inner join products  p on o.supplierid = p.supplierid\r\n" + 
				"inner join orderdetails od on od.orderid = o.orderid ;");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query5() {
		try {
		ResultSet result = statement.executeQuery("SELECT *\r\n" + 
				"FROM Orders\r\n" + 
				"WHERE OrderDate >= CURDATE() - INTERVAL 1 MONTH;");
			while(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getTimestamp(2)+"\t"+result.getInt(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query6() {
		try {
		ResultSet result = statement.executeQuery("select p.name , sum(od.quantity)\r\n" + 
				"from products p\r\n" + 
				"inner join\r\n" + 
				"orderdetails od\r\n" + 
				"on p.productid = od.productid \r\n" + 
				"group by p.name;");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query7() {
		try {
		ResultSet result = statement.executeQuery("select o.orderid , sum(od.quantity * price) as totalAmountSpent\r\n" + 
				"from orders o\r\n" + 
				"inner join\r\n" + 
				"orderdetails od on o.orderid = od.orderid \r\n" + 
				"group by od.orderid;");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query8() {
		try {
		ResultSet result = statement.executeQuery("SELECT p.name AS ProductName, COUNT(DISTINCT p.SupplierID) AS SupplierCount\r\n" + 
				"FROM Products p\r\n" + 
				"GROUP BY p.ProductID, p.Name\r\n" + 
				"HAVING COUNT(DISTINCT p.SupplierID) > 1;");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query9() {
		try {
		ResultSet result = statement.executeQuery("select p.name , avg(i.quantityonhand)as AverageInventory\r\n" + 
				"from inventory i \r\n" + 
				" join products p\r\n" + 
				"on p.productid = i.productid\r\n" + 
				"group by p.productid;");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query10() {
		try {
		ResultSet result = statement.executeQuery("select s.name , p.name from \r\n" + 
				"suppliers s right join \r\n" + 
				"products p on\r\n" + 
				"p.supplierid = s.SupplierID\r\n" + 
				"where p.productid is null ;");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void addInventory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter InventoryID :");
		int id = sc.nextInt();
		System.out.println("Enter ProductID :");
		int productid = sc.nextInt();
		System.out.println("Enter Quantity :");
		int quantity = sc.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into inventory values(?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, productid);
			preparedStatement.setInt(3, quantity);
            preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OrderID :");
		int id = sc.nextInt();
		System.out.println("Enter OrderDate :");
		int orderDate = sc.nextInt();
		System.out.println("Enter SupplierID :");
		int supplierID = sc.nextInt();
		
		try {
			preparedStatement = connection.prepareStatement("insert into inventory values(?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, orderDate);
			preparedStatement.setInt(3, supplierID);
            preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter ProductID :");
			int id = sc.nextInt();
			System.out.println("Enter ProductName :");
			String name = sc.next();
			System.out.println("Enter Description :");
			String desc = sc.next();
			System.out.println("Enter SupplierID :");
			int supplierid = sc.nextInt();
			
			preparedStatement = connection.prepareStatement("insert into products values (?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, desc);
			preparedStatement.setInt(4, supplierid);
			
            preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addSupplier() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter SupplierID :");
		int id = sc.nextInt();
		System.out.println("Enter SupplierName :");
		String name = sc.next();
		System.out.println("Enter Contact Info :");
		String contact = sc.next();
		System.out.println("Enter Address :");
		String address = sc.next();
		
		try {
			preparedStatement = connection.prepareStatement("insert into suppliers values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, address);
            preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addOrderDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OrederDetaiID :");
		int detailid = sc.nextInt();
		System.out.println("Enter OrderID :");
		int orderid = sc.nextInt();
		System.out.println("Enter ProductID :");
		int productid = sc.nextInt();
		System.out.println("Enter Quantity :");
		int quantity = sc.nextInt();
		System.out.println("Enter Price :");
		int price = sc.nextInt();

		
		try {
			preparedStatement = connection.prepareStatement("insert into orderdetails values(?,?,?,?,?)");
			preparedStatement.setInt(1, detailid);
			preparedStatement.setInt(2, orderid);
			preparedStatement.setInt(3, productid);
			preparedStatement.setInt(4, quantity);
			preparedStatement.setInt(5, price);
            preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



}
