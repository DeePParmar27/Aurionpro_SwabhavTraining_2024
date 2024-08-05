package com.aurionpro.test;
import java.util.Scanner;

public class ArraySum {
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
		
		int sum = 0 ;
		for(int i = 0 ; i < len ; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("The sum of array is :"+sum);
	}

}
