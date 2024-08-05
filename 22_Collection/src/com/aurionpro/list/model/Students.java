package com.aurionpro.list.model;

public class Students {
	
	public int id ;
	public String name ;
	public int Percentage ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return Percentage;
	}
	public void setRollNo(int percentage) {
		this.Percentage = percentage;
	}
	public Students(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.Percentage = percentage;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", Percentage=" + Percentage + "]";
	}
	
	

}
