package com.aurionpro.map.test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {
public static void main(String[] args) {
	
	Map<String , Integer> map = new HashMap<String, Integer>();
	Map<String , Integer> map1= new TreeMap<String, Integer>();

	
	map.put("A", 100);
	map.put("X", 200);
	map.put("C", 200);
	map.put(null, 400);
	map.putIfAbsent("D", 100);
	map.putIfAbsent("Y", 10000);
	
	System.out.println(map);
	
	
	map1.put("A", 100);
	map1.put("X", 200);
	map1.put("C", 200);
	map1.put("Z", 400);
	map1.putIfAbsent("D", 100);
	
	System.out.println(map1);
}
}
