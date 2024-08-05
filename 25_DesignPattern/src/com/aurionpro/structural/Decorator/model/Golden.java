package com.aurionpro.structural.Decorator.model;

public class Golden extends HatDecorator {

	public Golden(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getName() {
		return hat.getName()+"This is Golden Hat";
		
	}

	@Override
	public String getPrice() {
		return "Price of Golden hat :900";
		
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+" Golden";
		
	}

}
