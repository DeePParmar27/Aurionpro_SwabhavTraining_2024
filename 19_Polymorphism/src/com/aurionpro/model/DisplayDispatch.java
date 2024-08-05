package com.aurionpro.model;


public class DisplayDispatch {

	public class main{
		public void display() {
			System.out.println("This is base class");
		}
	}

	
	public class Derived1 extends main{
		public void display() {
			System.out.println("Inside Derived class 1");
		}
	}
	
	public class Derived2 extends main{
		public void display() {
			System.out.println("This Derived class 2");
		}
	}
	
}


