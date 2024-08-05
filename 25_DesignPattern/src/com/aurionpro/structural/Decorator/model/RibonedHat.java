package com.aurionpro.structural.Decorator.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		return hat.getName()+"This is Riboned Hat";
		
	}

	@Override
	public String getPrice() {
		return "Price of Golden hat :1900";
		
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+" Riboned";
		
	}

}
