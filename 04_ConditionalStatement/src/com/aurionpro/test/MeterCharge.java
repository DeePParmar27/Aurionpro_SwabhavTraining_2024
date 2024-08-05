package com.aurionpro.test;
import java.util.Scanner;;

public class MeterCharge {
public static void main(String[] args) {
	
	Scanner sc = new  Scanner(System.in);
	System.out.println("No. of Units Consumed :- ");
	int units = sc.nextInt() ;
	int meter_charge = 75 ;
	
	if(units <= 100 ) {
		int charge =  units*5 ;
		int Total_water_bill = charge+meter_charge ;
		System.out.println("Total Water Bill :-"+Total_water_bill);
	}
	else {
		if(units <= 250) {
	        int  charge =  100*5 ;
	        units = units-100 ;
	        charge += units*10 ;
			int Total_water_bill = charge+meter_charge ;
			System.out.println("Total Water Bill :-"+Total_water_bill);
		}
		else {
			int charge =  units*20 ;
			int Total_water_bill = charge+meter_charge ;
			System.out.println("Total Water Bill : "+Total_water_bill);	
		}
	}
	
	
}
}
