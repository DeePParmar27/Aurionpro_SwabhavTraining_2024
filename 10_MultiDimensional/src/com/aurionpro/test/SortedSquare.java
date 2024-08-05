package com.aurionpro.test;
import java.util.*;

public class SortedSquare {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int arr[] = {1 , 2 , 3 , 4 , 5};
	int n = arr.length ;
	
	sortedArray(n , arr);
	
}
public static int sortedArray(int n , int arr[]) {
	   
	   for(int i = 0 ;i < n ; i++) {
		   arr[i] = arr[i]*arr[i];
	   }
	   
	   for(int i = 0 ;i < n ; i++) {
		   System.out.print(arr[i]+"  ");
	   }
		return 0;
}
}
