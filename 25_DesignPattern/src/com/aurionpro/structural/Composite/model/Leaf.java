package com.aurionpro.structural.Composite.model;


public class Leaf implements Components {

	public int price ;
	public String name ;
	
	
	
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}




	@Override
	public void showPrice() {
		System.out.println(name +" : "+price);
	}

}
