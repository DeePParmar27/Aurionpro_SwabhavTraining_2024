package com.aurionpro.structural.car.model;

public class CarServiceDecorator implements ICarService{

	ICarService carObj ;
	
	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}

	@Override
	public double getCost() {
		return carObj.getCost() ;
	}

}
