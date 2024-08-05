package com.aurionpro.test;
import java.util.*;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length of Array :");
	int n =  sc.nextInt();
	
	int arr[];
	arr = new int[n];
	
	System.out.println("Enter Elemnts of Array :");
	for(int i = 0 ; i < n ; i++) {
	    arr[i] = sc.nextInt() ; 
	}
	
	
	System.out.println("Elements of Array is :");
	for(int j = 0 ; j < n ; j++) {
		System.out.print(arr[j]+" ");
	}
	
	System.out.println("");
	
	
	System.out.println("Reverse of Array is :");
	int i = 0;
	int j = n-1 ;
	while(i < j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++ ;
		j-- ;
	}
	
	for(int k = 0 ; k < n ; k++) {
		System.out.print(arr[k]+" ");
	}
	
}
}
