package com.aurionpro.creational.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopeName ;
	List<Book> booksList = new ArrayList<>();
	
	public String getShopeName() {
		return shopeName;
	}
	public void setShopeName(String shopeName) {
		this.shopeName = shopeName;
	}
	public List<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	@Override
	public String toString() {
		return "BookShop [shopeName=" + shopeName + ", booksList=" + booksList + "]";
	}
	
	public BookShop(String shopeName, List<Book> booksList) {
		super();
		this.shopeName = shopeName;
		this.booksList = booksList;
	}
	

	public BookShop() {
		super();
	}
	public void loadData() {
		for(int i = 0 ; i < 10 ; i++) 
		{
			Book b = new Book();
			b.bookId = i ;
			b.bookName = "Book--"+i;
			booksList.add(b);
		}
	}
	
	@Override
	public BookShop clone() throws CloneNotSupportedException {
		 BookShop shop = new BookShop();
		 for(Book b : this.getBooksList()) {
			 shop.getBooksList().add(b);
		 }
		 return shop ;
	}
	
	
	
}
