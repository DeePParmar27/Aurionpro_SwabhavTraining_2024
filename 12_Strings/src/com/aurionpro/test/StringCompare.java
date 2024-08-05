package com.aurionpro.test;

public class StringCompare {
public static void main(String[] args) {
	String name1 = "AR" ;
	String name2 = "AR" ;
	System.out.println(name1.hashCode());
	System.out.println(name2.hashCode());
	System.out.println(name1 == name2);
	
	String name3 = "B";
	System.out.println(name3.hashCode());
	name3 = name2 + "B" ;
	System.out.println(name3.hashCode());
}
}
