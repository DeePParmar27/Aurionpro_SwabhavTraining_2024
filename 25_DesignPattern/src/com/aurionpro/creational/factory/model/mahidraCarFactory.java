package com.aurionpro.creational.factory.model;

public class mahidraCarFactory implements ICarFactory {

	@Override
	public Icar makeCar() {
		return new Mahindra();
	}



}
