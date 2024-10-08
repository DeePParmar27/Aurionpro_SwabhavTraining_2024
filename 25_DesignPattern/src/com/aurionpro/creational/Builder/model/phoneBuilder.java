package com.aurionpro.creational.Builder.model;

public class phoneBuilder {
	private String firstName ;
	private String lastName ;
	private int age ;
	private String gender ;
	
	public phoneBuilder setFirstName(String firstName) {
		this.firstName = firstName ;
		return this ;
	}
	
	public phoneBuilder setLastName(String lastName) {
		this.lastName = lastName ;
		return this ;
	}
	
	public phoneBuilder age(int age) {
		this.age = age ;
		return this ;
	}
	
	public phoneBuilder setGender(String gender) {
		this.gender = gender ;
		return this ;
	}
	
	
	public phone build() {
		return new phone(firstName,lastName,age,gender);
	}


}
