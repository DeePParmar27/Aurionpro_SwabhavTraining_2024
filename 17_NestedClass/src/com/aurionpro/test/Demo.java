package com.aurionpro.test;

import com.aurionpro.model.Class_A;

public class Demo {
	public static void main(String[] args) {

		Class_A a = new Class_A();
		System.out.println(a.name);

		Class_A.Class_B b = a.new Class_B();
		System.out.println(b.car);
		
		Class_A.Class_B.Class_C c = b.new Class_C();
		System.out.println(c.lname);
		System.out.println();
	}

}
