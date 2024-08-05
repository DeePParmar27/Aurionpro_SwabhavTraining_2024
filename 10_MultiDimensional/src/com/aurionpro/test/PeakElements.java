package com.aurionpro.test;

public class PeakElements {
public static void main(String[] args) {
	
	int arr[]  = {1, 3, 5, 4, 7 };
	int n = arr.length ;
	
		
	peakElement(n, arr);
}
public static int peakElement(int n , int arr[]) {
	
	if(arr[0] > arr[1]) {
		System.out.println(arr[0]);
	}
	
	for(int i = 1 ; i < n-1 ; i++) {
		if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
			System.out.println("Peak Elements are :"+arr[i]);
		}

	}
	
	
	if(arr[n-1] > arr[n-2]) {
		System.out.println("Peak Elements are :"+arr[n-1]);
	}
	
	return 0;
}
}
