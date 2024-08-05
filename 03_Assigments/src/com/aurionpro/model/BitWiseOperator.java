package com.aurionpro.model;

public class BitWiseOperator {
public static void main(String[] args) {
	int a = 15 ;
	int b = 20 ;
	
	System.out.println("This is Left Shift:- "+(a<<1));  //Numbers become Double
	System.out.println("This is Right Shift:- "+(a>>2)); //Numbers Become Half
	
	System.out.println("This is AND (&) Opertor :- "+(a & b));
	System.out.println("This is OR (|) Opertor :- "+(a | b));

	
	

}
}
