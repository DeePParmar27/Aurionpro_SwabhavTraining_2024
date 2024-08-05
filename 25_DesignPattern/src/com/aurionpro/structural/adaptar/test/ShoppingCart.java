package com.aurionpro.structural.adaptar.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	
	List<IItems> cartItems = new ArrayList<>() ;
	
	public void addItemsTocart(IItems product) {
		cartItems.add(product);
		}
	
	public void getItemsList() {
		for(IItems items : cartItems) {
			System.out.println(items.getItemName()+" ---- "+items.getItemPrice());
			System.out.println(" ------------------- ");
		}
	}
	
	public void getCartPrice() {
		double itemPrice = 0 ;
		for(IItems items : cartItems) {
			itemPrice = itemPrice+items.getItemPrice();
		}
		System.out.println("Total Price :- "+itemPrice);
	}
	
	

}
