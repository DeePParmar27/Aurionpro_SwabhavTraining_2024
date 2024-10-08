package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.BookShop;

public class bookTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs1 = new BookShop();
		bs1.setShopeName("Marvel");
		bs1.loadData();
		
		BookShop bs2 = (BookShop) bs1.clone();
		bs2.setShopeName("DC");
		bs1.getBooksList().remove(2);
		
		System.out.println(bs1.getShopeName());
		System.out.println(bs1.getBooksList());
		
		System.out.println(bs2.getShopeName());
		System.out.println(bs2.getBooksList());


		
		
		
		
	}

}
