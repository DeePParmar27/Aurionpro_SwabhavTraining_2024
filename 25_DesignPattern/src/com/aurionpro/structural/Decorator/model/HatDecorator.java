package com.aurionpro.structural.Decorator.model;

public class HatDecorator implements IHat {
	IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public String getPrice() {
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription();
	}

}
