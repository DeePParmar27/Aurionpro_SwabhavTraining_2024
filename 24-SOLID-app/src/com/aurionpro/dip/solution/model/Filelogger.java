package com.aurionpro.dip.solution.model;

public class Filelogger implements Ilogger{

	@Override
	public void log(String err) {
		System.out.println("In the File "+err);
		
	}

}
