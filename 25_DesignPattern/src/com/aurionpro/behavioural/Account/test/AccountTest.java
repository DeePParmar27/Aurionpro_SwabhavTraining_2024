package com.aurionpro.behavioural.Account.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<INotifier> notifiers = new ArrayList<INotifier>() ;
		notifiers.add(new EmailNotifier());
		notifiers.add(new SMSNotifier());
	
		Account acc = new Account(12121, "Deep", 1000, notifiers);

		System.out.println("Choose the Option : ");
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		System.out.println("Enter the Amount :");
		int option = sc.nextInt();
		
		if(option == 1) {
			int amount = sc.nextInt();
			acc.credit(amount);
		}
		else if(option == 2) {
			int amount = sc.nextInt();
			acc.debit(amount);
	     }
		
		
//	acc.debit(9000);
		

	}

}
