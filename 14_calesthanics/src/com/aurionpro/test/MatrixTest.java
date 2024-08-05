package com.aurionpro.test;
import java.util.Scanner; 

public class MatrixTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int matrix[][] = new int[3][3];
	
     createRow(matrix, sc);
	
	System.out.println("Matrix:");
	
      rowDisplay(matrix);
}

private static void rowDisplay(int matrix[][]) {
	// TODO Auto-generated method stub
	for(int i = 0 ; i < 3 ;i++) {
        rowElementDisplay(matrix, i);
		System.out.println(" ");
	}
	
}

private static void rowElementDisplay(int matrix[][] , int i) {
	// TODO Auto-generated method stub
	for(int j = 0 ; j < 3 ;j++) {
		System.out.print(matrix[i][j]+" ");
	}
	
}

private static void createRow(int matrix[][] ,Scanner sc ) {
	// TODO Auto-generated method stub
	for(int i = 0 ; i < 3 ;i++) {
        elementsOfRow(matrix, sc, i);
	}
}

private static void elementsOfRow(int matrix[][] ,Scanner sc , int i) {
	for(int j = 0 ; j < 3 ;j++) {
		matrix[i][j] = sc.nextInt();
	}
}

}
