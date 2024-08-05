package com.aurionpro.model;

public class Car extends FourWheeler {
private int price ;

public Car(String companyName , double milage , int price){
	super(companyName , milage);
	this.price = price ;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Car [price=" + price + ", Milage=" + getMilage() + ", CompanyName=" + getCompanyName()
			 + "]";
}

}
