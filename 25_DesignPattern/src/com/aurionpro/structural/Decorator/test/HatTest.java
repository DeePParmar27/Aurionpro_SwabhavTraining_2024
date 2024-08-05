package com.aurionpro.structural.Decorator.test;

import com.aurionpro.structural.Decorator.model.Golden;
import com.aurionpro.structural.Decorator.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		StandardHat sandard = new StandardHat();
		Golden gold = new Golden(sandard);
		System.out.println(gold.getDescription());
	}

}
