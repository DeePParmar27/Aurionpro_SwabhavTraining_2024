package com.aurionpro.test;
import java.util.*;

public class SumOfRow {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of Rows: ");
	int rows = sc.nextInt();
	
	System.out.println("Enter Number of Column: ");
	int col = sc.nextInt();
	
	int matrix[][] =  new int[rows][col];
	
	System.out.println("Enter elements of Matrix: ");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ; j++) {
			matrix[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Your Matrix is :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ; j++) {
			System.out.print(matrix[i][j]+" ") ;
		}
	System.out.println(" ");
	}
	
	int sum = 0 ;
	int count = 0;
	

	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ; j++) {
			sum = sum + matrix[i][j];
		}
	count++ ;	
	System.out.println("The sum of row "+count+" is : "+sum);
	sum = 0 ;
	}
	
	
	
}
}
