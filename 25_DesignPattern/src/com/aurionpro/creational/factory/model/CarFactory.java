package com.aurionpro.creational.factory.model;

public class CarFactory {
	
	public Icar makeCar(Enum carName) {
		Icar car = null ;
		if(carName == Cars.Tata)
			car = new Tata() ;
		
		if(carName == Cars.Mahindra)
			car = new Mahindra() ;
		
		
		if(carName == Cars.Maruti)
			car = new Maruti() ;
		
		return car ;
		
	}

}
