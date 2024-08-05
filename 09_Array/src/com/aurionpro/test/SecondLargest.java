package com.aurionpro.test;

import java.util.Scanner;

public class SecondLargest {
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
			int secondLargest = 0 ;
			for(int i = 1 ; i < len ; i++) {
				if(arr[i] >  max) {
					secondLargest = max ;
					max = arr[i];
				}
				else if(arr[i] < max && arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
			
			System.out.println("The SecondLargest in array is :"+secondLargest);
	}

}
