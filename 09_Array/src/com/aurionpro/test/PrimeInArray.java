
package com.aurionpro.test;
import java.util.*;

public class PrimeInArray {
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
		int flag = 1 ;
		System.out.println("");

		for(int i = 0 ; i < n ; i++) {
			for(int j = 2 ; j < arr[i] ; j++) {
				if(arr[i] % j == 0) {
					flag = 0 ;
					break;
				}
				else {
					flag = 1 ;
				}

			}
			if(flag == 1) {
				System.out.println("The Number is :"+arr[i]);
			}
		}
		

	}

}
