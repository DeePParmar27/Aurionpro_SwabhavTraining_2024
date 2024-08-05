package com.aurionpro.map.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;




public class entrySetDemo {
	public static void main(String[] args) {
		
		Map<Integer , String> map = new   HashMap<Integer, String>();
		map.put(1, "Deep");
		map.put(2, "Aditiya");
		map.put(3, "Harsh");
		
		Set<Entry<Integer, String>> entriesMap = map.entrySet();
		for(Entry<Integer , String> entries : entriesMap) {
			System.out.println(entries.getKey()+" -- "+entries.getValue());
		}
		
	}

}
