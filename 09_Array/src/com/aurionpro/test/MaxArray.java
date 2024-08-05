package com.aurionpro.test;
import java.util.*;

public class MaxArray {
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
		
		int max = arr[0];
		for(int i = 1 ; i < len ; i++) {
			if(arr[i] >  max) {
				max = arr[i];
			}
		}
		
		System.out.println("The max in array is :"+max);

	}

}
