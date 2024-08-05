package com.aurionpro.test;
import java.util.*;
public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Digit :");
		
		int sum = 0 ;
		int dig = sc.nextInt() ;
		int temp = dig ;
		int temp2 = dig ;
		int pow = 0 ;
		
		while(temp2 > 0)
		{
		  pow++;
		  temp2 = temp2/10 ; 
		}
		
		
		while(dig > 0) {
			int lastDig = dig%10 ;
			int digCube =(int)Math.pow(lastDig, pow) ;
			sum = sum + digCube ;
			dig = dig/10 ;
		}
		
		if(sum == temp) {
			System.out.println("They are Armstrong Numbers");
		}
		else {
			System.out.println("They are Not");
		}
	}

}
