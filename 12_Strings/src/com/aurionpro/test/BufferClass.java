package com.aurionpro.test;

public class BufferClass {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Deep");
		System.out.println(name.hashCode());
		name.append("Parmar");
		System.out.println(name.hashCode());
	}

}
