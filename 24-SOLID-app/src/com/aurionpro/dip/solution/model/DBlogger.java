package com.aurionpro.dip.solution.model;

public class DBlogger implements Ilogger {

	@Override
	public void log(String err) {
		System.out.println("Into the database "+err);
	}

}
