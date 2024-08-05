package com.aurionpro.test;
import java.util.*;

public class SumOfArray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of Rows:- ");
	int rows = sc.nextInt();

	System.out.println("Enter Number of Columns:- ");
	int col = sc.nextInt();
	
	int matrix[][] = new int[rows][col];

	
	System.out.println("Enter ELEMENTS OF MATRIX :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			matrix[i][j] = sc.nextInt();
		}
	}
	

	int sum = 0 ;
	
	for(int i = 0 ; i< rows ; i++) {
		for(int j = 0 ; j < col ; j++) {
			sum += matrix[i][j];
		}
	}
	
	System.out.println(sum);
}
}
