package com.aurionpro.test;

public class MinuteConverter {
	public static void main(String[] args) {
		int GivenMinutes = 200 ;
		
		int hours = GivenMinutes/60 ;
		int minutes = GivenMinutes-(60*hours);
		
		
		System.out.println(GivenMinutes+" minutes is "+hours +" hours and "+minutes +" minutes");
//		System.out.println(hours);
//		System.out.println(minutes);
//		
	}

}

