package com.aurionpro.test;
import java.util.*;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Natural Number :");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0 ;
		while( i <= n) {
			sum = sum + i ;
			i++ ;
		}
		System.out.println(sum);
	}

}
