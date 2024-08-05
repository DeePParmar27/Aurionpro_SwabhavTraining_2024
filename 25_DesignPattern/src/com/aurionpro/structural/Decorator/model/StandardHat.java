package com.aurionpro.structural.Decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "This is Standard Hat";
		
	}

	@Override
	public String getPrice() {
		return "900";
		
	}

	@Override
	public String getDescription() {
		return "Standard";
		
	}

}
