package com.aurionpro.test;
import java.util.Scanner;

public class MultiDimensionalSearch {
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
	
	System.out.println("ENter the number you want to search :");
	int num = sc.nextInt();
	
	int flag = 0 ;
	int row_pos = 0 ;
	int col_pos  = 0;
	
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			if(matrix[i][j] == num) {
				flag = 1 ;
				row_pos = i+1 ;
				col_pos = j+1 ;
				break;
			}
		}
	}
	
	if(flag == 1) {
		System.out.println("The Number has been Found");
		System.out.println("Its Position is at "+row_pos+" row "+col_pos+" column");
	}
	else {
		System.out.println("The Number is Not Present");
	}
	
}
}
