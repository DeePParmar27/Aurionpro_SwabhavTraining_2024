package com.aurionpro.test;
import java.util.*;

public class DuplicatesArray {
public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter the Length of Array :");
	int len = sc.nextInt();
	
	int arr[];
	arr = new int[len];
	
	System.out.println("Enter the number :");
	for(int i = 0 ; i < len ; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Elements of Array is :");
	for(int j = 0 ; j < len ; j++) {
		System.out.print(arr[j]+" ");
	}
	
	System.out.println("");
	
	int count = 0 ;
	int flag = 0 ;
	
	for(int i = 0 ; i < len-1 ; i++) {
		for(int j = i+1 ; j < len ; j++) {
			if(arr[i] == arr[j]) {
				flag = 1 ;
				break ;
			}
			else {
				flag = 0 ;
			}
				
		}
		if(flag == 1) 
		{
			count++;
		}		
	}
	
	System.out.println(count);
}
}
