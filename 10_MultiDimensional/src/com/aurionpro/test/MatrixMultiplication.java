package com.aurionpro.test;
import java.util.*;

public class MatrixMultiplication {
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
	
	
	System.out.println("MATRIX 1 :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			System.out.print(matrix_1[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	System.out.println("MATRIX 2 :");
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			System.out.print(matrix_2[i][j]+" ");
		}
		System.out.println(" ");
	}


	
	int Matrix_Multiplication[][] = new int[rows][col];
	int sum = 0 ;


	System.out.println("Multiplication of matrix is :");
	for(int i = 0 ; i < rows ; i++) {
		sum = 0 ;
		for(int j = 0 ; j < col ;j++) {
			for(int k = 0 ; k < col ; k++) {
				sum = sum + (matrix_1[i][j]*matrix_2[k][j]);
				Matrix_Multiplication[i][j] = sum ;
			}
			
		}

	}
	
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < col ;j++ ) {
			System.out.print(Matrix_Multiplication[i][j]+" ");
		}
		System.out.println(" ");
	}

}
}
