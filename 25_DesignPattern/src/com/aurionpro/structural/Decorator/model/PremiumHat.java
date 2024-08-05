package com.aurionpro.structural.Decorator.model;

import javax.print.DocFlavor.STRING;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "This is Premium Hat ";
		
	}

	@Override
	public String getPrice() {
		return "1000 ";		
	}

	@Override
	public String getDescription() {
		return "Higher Ended Hats ";
		
	}

}
