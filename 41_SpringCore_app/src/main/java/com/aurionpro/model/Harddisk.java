package com.aurionpro.model;

public class Harddisk {
	
	private int capacity;

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}

	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public Harddisk() {
		super();
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
