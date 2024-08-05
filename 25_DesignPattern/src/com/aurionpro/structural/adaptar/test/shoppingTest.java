package com.aurionpro.structural.adaptar.test;

public class shoppingTest {
	public static void main(String[] args) {

		
		ShoppingCart sh = new ShoppingCart();
	sh.addItemsTocart(new HatAdaptar(new Hat("Urban", "Urban-Go", 900, 90)));
	sh.addItemsTocart(new Biscuit("Parle-G", 1000));
	sh.addItemsTocart(new HatAdaptar(new Hat("Urban", "Urban-Go", 900, 90)));
		
	sh.addItemsTocart(new Biscuit("Parle", 21));
		
		sh.getItemsList();
		sh.getCartPrice();

	}

}
