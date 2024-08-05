package com.aurionpro.creational.factory.model;

public class tataCarFactory implements ICarFactory {

	@Override
	public Icar makeCar() {
		return new Tata() ;
	}

}
