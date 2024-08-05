package com.aurionpro.test;

import java.lang.reflect.Method;

public class reflectionClass {
public static void main(String[] args) throws ClassNotFoundException {
	
	Class stringClass =  Class.forName("java.lang.String");
	
	System.out.println(stringClass.getName());
	
	Method stringMethod[] = stringClass.getMethods();
	for(Method method : stringMethod) {
		System.out.println(method.getName());
	}
	
	Package stringPackage = stringClass.getPackage();
    System.out.println(stringPackage.getName());
	
}
}
