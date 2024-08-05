package com.aurionpro.test;
import java.util.*;
public class CurrencyDenomination {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Amount :");
	int amount = sc.nextInt();
	int two_thousand_notes = 0 ;
	int five_hundred_notes = 0;
	int two_hundred_notes = 0;
	int one_hundred_notes = 0;
	
	if(amount > 2000) {
		two_thousand_notes = amount/2000 ;
		amount = amount - 2000*two_thousand_notes ;
	}
	if(amount >500){
		five_hundred_notes = amount/500 ;
		amount = amount - 500*five_hundred_notes ;
	}
	if(amount >200) {
		two_hundred_notes = amount/200 ;
		amount = amount - 200*two_hundred_notes ;
	}
	if(amount > 99) {
		one_hundred_notes = amount/100 ;
		amount = amount - 100*one_hundred_notes ;
	}
		
	System.out.println("Two Thousand :"+two_thousand_notes);
	System.out.println("Five Hundred :"+five_hundred_notes);
	System.out.println("Two Hundred :"+two_hundred_notes);
	System.out.println("One Hundred :"+one_hundred_notes);

}
}
