package com.aurionpro.creational.Builder.model;

public class phone {
	private String firstName ;
	private String lastName ;
	private int age ;
	private String gender ;
	public phone(String firstName, String lastName, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "phone [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
