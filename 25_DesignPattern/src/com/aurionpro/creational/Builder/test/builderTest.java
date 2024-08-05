package com.aurionpro.creational.Builder.test;

import com.aurionpro.creational.Builder.model.phone;
import com.aurionpro.creational.Builder.model.phoneBuilder;

public class builderTest {
	public static void main(String[] args) {
		phoneBuilder phbuild = new phoneBuilder() ;
		phbuild.age(12);
		phbuild.setLastName("Parmar").setFirstName("Deep");
		
		phone ph = phbuild.build();
		System.out.println(ph);
		
		
	}

}
