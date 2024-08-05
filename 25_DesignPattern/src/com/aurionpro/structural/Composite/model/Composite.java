package com.aurionpro.structural.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Components {

	String name ;
	List<Components> components = new ArrayList<>();
	
	public void addComponents(Components c) {
		components.add(c);
	}
	
	
	public Composite(String name) {
		super();
		this.components = components;
	}




	@Override
	public void showPrice() {
		for(Components c : components) {
			c.showPrice();
		}
		
	}
	
	

}
