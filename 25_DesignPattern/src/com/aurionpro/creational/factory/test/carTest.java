package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.Cars;
import com.aurionpro.creational.factory.model.ICarFactory;
import com.aurionpro.creational.factory.model.Icar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;
import com.aurionpro.creational.factory.model.marutiCarFactory;
import com.aurionpro.creational.factory.model.tataCarFactory;

public class carTest {
	public static void main(String[] args) {

ICarFactory marutiCar = new marutiCarFactory() ;
Icar maruti = marutiCar.makeCar();
maruti.Start();


	}

}
