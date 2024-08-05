package com.aurionpro.test;

public class PyramidTest {
	
	public static int isPrime(int num) {
		for(int i = 2 ; i *i <= num ; i++) {
			if(num%i == 0) {
				return -1 ;
			}
		}
		return 1 ;
		
	}
	
public static void main(String[] args) {
	int count = 2;
	for(int i = 1 ; i <= 5 ; i++) {
		for(int j = 1 ; j <= i ;j++) {
			while(isPrime(count) == -1) {
				count++ ;
			}
			System.out.print(count+"  ");
			count++;

		}
		System.out.println("");
	}
}
}
