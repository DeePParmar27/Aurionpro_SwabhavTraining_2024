package com.aurionpro.test;
import java.util.*;

public class ArrayChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("Enter the Length of Array :");
//	int len = sc.nextInt();
//	
//	int arr[];
//	arr = new int[len];
//	
//	System.out.println("Enter the number :");
//	for(int i = 0 ; i < len ; i++) {
//		arr[i] = sc.nextInt();
//	}
	
int arr[] = {12 , 32 , 43 , 20 , 32};
System.out.println("Enter the Number :");
int num = sc.nextInt();

int flag = 0 ;

for(int i = 0 ; i < arr.length ; i++) {
	if(arr[i] == num) {
		System.out.println("You Number is Present");
		flag = 1;
		break;
	}else {
		continue ;
	}
	
}

if(flag == 0 ) {
	System.out.println("NOT PRESENT");
}


	
}
}
