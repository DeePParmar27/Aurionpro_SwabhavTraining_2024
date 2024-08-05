package com.aurionpro.structural.car.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService carObj) {
		super(carObj);
	}
	
	public double getCost() {
		return 500+carObj.getCost();
	}


}

