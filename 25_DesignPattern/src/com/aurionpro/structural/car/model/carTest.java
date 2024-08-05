package com.aurionpro.structural.car.model;

public class carTest {
	public static void main(String[] args) {
		CarService car = new CarService();
		OilChange oil =  new OilChange(car);
		System.out.println("The total cost :"+oil.getCost());
		
	}

}
