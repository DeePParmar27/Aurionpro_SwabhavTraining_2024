package com.aurionpro.list.test;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String> names =  new ArrayList();
	names.add("Deep");
	names.add("Sarthak");
	names.add("Aditya");
	
	ArrayList<String>  otherNames = new ArrayList();
	
	otherNames.add("Vaishu");
	otherNames.add("Om");
	
	names.addAll(otherNames);
	System.out.println(names.contains("Dep"));
	System.out.println(names.size());
	System.out.println(names);
}
}
