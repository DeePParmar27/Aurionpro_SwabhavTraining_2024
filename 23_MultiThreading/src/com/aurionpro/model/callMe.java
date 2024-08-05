package com.aurionpro.model;

public class callMe {
	
	private String meassage ;
	
	public void call(String message) {
		System.out.print("[ "+message);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
