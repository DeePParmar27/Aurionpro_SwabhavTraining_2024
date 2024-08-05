package com.aurionpro.creational.factory.model;

public class marutiCarFactory implements ICarFactory {

	@Override
	public Icar makeCar() {
		return new Maruti() ;
	}

}
