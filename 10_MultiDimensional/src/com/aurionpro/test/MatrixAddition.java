package com.aurionpro.test;
import java.util.Scanner;

public class MatrixAddition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number of Rows:- ");
	int rows = sc.nextInt();

	System.out.println("Enter Number of Columns:- ");
	int col = sc.nextInt();
	
	int matrix_1[][] = new int[rows][col];
	int matrix_2[][] =  new int[rows][col];
	

	
	System.out.println("Enter ELEMENTS OF MATRIX_1 :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			matrix_1[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Enter ELEMENTS OF MATRIX_2 :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			matrix_2[i][j] = sc.nextInt();
		}
	}
	
	int Matrix_Addtion[][] = new int[rows][col];
	
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			Matrix_Addtion[i][j] = matrix_1[i][j] + matrix_2[i][j];
		}
	}
	
	System.out.println("The Addition of MAtrix is :");
	
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			System.out.print(Matrix_Addtion[i][j]+"  ");
		}
		System.out.println(" ");
	}
	
	


	
}
}
