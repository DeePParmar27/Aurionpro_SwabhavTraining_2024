package com.aurionpro.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();   //--For Sorted Order 
		set.add("Deep");
		set.add("deep");
		set.add("Dhruvil");
		set.add("abhi");
		set.add("Ball");
		
		System.out.println(set);
		
		Set<Integer> setInt = new LinkedHashSet<>();
		setInt.add(12);
		setInt.add(15);
		setInt.add(5);
		setInt.add(20);
		
		System.out.println(setInt);
		
		System.out.println(setInt.contains(12));
	
		
		Set<Integer> setter =  new HashSet<>();
		setter.add(92);
		setter.add(19);
		setter.add(9);
		setter.add(90);
		
		System.out.println(setter);
		
		setInt.addAll(setter);
		System.out.println(setInt);
		
		

	}

}
