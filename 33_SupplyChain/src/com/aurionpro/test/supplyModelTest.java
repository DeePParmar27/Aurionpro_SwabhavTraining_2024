package com.aurionpro.test;

import com.aurionpro.model.supplyModel;

public class supplyModelTest {
public static void main(String[] args) {
	supplyModel supply = new supplyModel();
	supply.connectToDatabase();
	//supply.getInventoryDetails();
	//supply.getSupplier();
	//supply.query9();
	
//	supply.getProducts();
//	supply.addProduct();
//	supply.getProducts();
	
//	supply.getInventoryDetails();
//	supply.addInventory();
//	supply.getInventoryDetails();
	
	System.out.println("Choose Option");
	System.out.println("1. Inventory Detail");
	System.out.println("2. OrderDetails Detail");
	System.out.println("3. Order Detail");
	System.out.println("4. Product Detail");
	System.out.println("5. Supplier Detail");


	
}
}
