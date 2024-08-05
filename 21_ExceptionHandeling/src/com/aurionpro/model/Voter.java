package com.aurionpro.model;

import com.aurionpro.exceptions.VoterAgeException;

public class Voter {

	private int voterID;
	private String FirstName;
	private String LastName;
	private int age;

	public int getVoterID() {
		return voterID;
	}

	public Voter(int voterID, String firstName, String lastName, int age) {
		super();
		this.voterID = voterID;
		FirstName = firstName;
		LastName = lastName;
		if (age < 18)
			throw new VoterAgeException(age);
		this.age = age;

	}

	@Override
	public String toString() {
		return "voter [voterID=" + voterID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age
				+ "]";
	}

	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18)
			throw new VoterAgeException(age);
		this.age = age;

	}
}
