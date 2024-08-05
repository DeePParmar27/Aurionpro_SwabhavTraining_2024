package com.aurionpro.structural.adaptar.test;

public class HatAdaptar implements IItems {

	Hat hat ;
	public HatAdaptar(Hat hat) {
		super();
		this.hat = hat;
	}


	@Override
	public String getItemName() {
		return hat.getLongName()+hat.getShortName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return (hat.getPrice()+hat.getTax());
	}
	
	

}
