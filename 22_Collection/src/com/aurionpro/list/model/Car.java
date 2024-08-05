package com.aurionpro.list.model;

public class Car {
	public int carId ;
	public String CompanyName;
	public int price ;
	public double milage;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public Car(int carId, String companyName, int price, double milage) {
		super();
		this.carId = carId;
		CompanyName = companyName;
		this.price = price;
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", CompanyName=" + CompanyName + ", price=" + price + ", milage=" + milage + "]";
	} 
	
	

}
