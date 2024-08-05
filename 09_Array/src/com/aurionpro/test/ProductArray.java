package com.aurionpro.test;

import java.util.Scanner;

public class ProductArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length :");
		int len = sc.nextInt();
		int arr[] = new int[len];
		int productArray[] = new int[len];
		int product = 1;
		System.out.println("Enter Elements of Array:-");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			product = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				} else {
					product = product * arr[j];
					productArray[i] = product;
				}
			}
		}
		System.out.println("------------------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(productArray[i]);
		}
	}
}
