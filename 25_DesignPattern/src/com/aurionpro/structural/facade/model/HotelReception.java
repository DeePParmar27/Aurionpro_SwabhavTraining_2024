package com.aurionpro.structural.facade.model;

public class HotelReception {

	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu menu=indHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getItalianMenu() {
		IHotel itaMnu = new ItalianHotel();
		itaMnu.getMenu();
	}
	

}
