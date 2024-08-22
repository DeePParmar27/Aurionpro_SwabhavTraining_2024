package com.aurionpro.model;

public class Computer {

	private Harddisk harddisk ;
	private String name ;


	public Computer(Harddisk harddisk, String name) {
		super();
		this.harddisk = harddisk;
		this.name = name;
	}
	
	
	public Harddisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}

	public Computer() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Computer [disk=" + harddisk + ", name=" + name + "]";
	}
	
	
	
	
}
