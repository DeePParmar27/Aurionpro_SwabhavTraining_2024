package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class stringStream {
public static void main(String[] args) {
	
	String[] name = {"Jayesh" ,"Nimesh" ,"Mark","Mahesh","Ramesh"};

	List<String> names = Arrays.asList(name);
	
	System.out.println("Ascending Order :");
	names.stream().sorted().forEach((n)->System.out.println(n));
	
	System.out.println("first 3 students sorted in ascending order if it contains a  :");
	names.stream().sorted().filter(n->n.contains("a"))
	 .limit(3)
	.forEach((n)->System.out.println(n));
	
//	names.stream().map(name->name.substring(0,3));
	
	
	System.out.println("String in Reverse Oreder :");
	names.stream().sorted(Comparator.reverseOrder()).forEach((n)->System.out.println(n));
	System.out.println("String length less than 4");
	names.stream().filter(n->n.length() <= 4).forEach(n->System.out.println(n));
	
	

}
}
