package com.aurionpro.test;
import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Array Size :");
	int size = sc.nextInt();
	
	int arr[];
	arr = new int[size];
	
	System.out.println("Enter The elements of Array :");
	for(int i = 0 ; i < size ; i++) {
		arr[i] = sc.nextInt() ;
	}
	
	System.out.println("Elements of Array is :");
	for(int j = 0 ; j < size ; j++) {
		System.out.print(arr[j]+" ");
	}
}
;
}
