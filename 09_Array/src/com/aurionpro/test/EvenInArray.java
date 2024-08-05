package com.aurionpro.test;
import java.util.*;

public class EvenInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length of Array :");
	int n = sc.nextInt();
	
	int arr[];
	arr = new int[n];
	
	System.out.println("Enter the number :");
	for(int i = 0 ; i < n ; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Elements of Array is :");
	for(int j = 0 ; j < n ; j++) {
		System.out.print(arr[j]+" ");
	}
	
	System.out.println("");
	int count = 0 ;
	System.out.println("Number of Even in Array :");
	for(int i = 0 ; i < n ; i++) {
		if(arr[i] % 2 == 0) {
			count++ ;
		}
	}
	
	System.out.println(count);

}
}
