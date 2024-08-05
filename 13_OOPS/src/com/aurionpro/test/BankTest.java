package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.AccountType;
import com.aurionpro.model.Bank;

public class BankTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank(1,"Deep",1000,AccountType.Saving);

		for (int i = 0; i < bank.length; i++) {
			System.out.print("Enter Account Number : ");
			int accoutNumber = sc.nextInt();
			System.out.print("Enter Your Name : ");
			String name = sc.next();
			System.out.print("Enter Balance : ");
			int accoutBalance = sc.nextInt();
			System.out.print("Enter Account Type : ");
			System.out.println("Choose Option :");
			System.out.println("1. Saving ");
			System.out.println("2. Current");
			int optionType = sc.nextInt();
			String type
			if(optionType == 1) {
				type
			}
			
            bank[i] = new Bank(accoutNumber,name,accoutBalance,type);  
			
			System.out.println("Choose Option :");
			System.out.println("1. Deposite ");
			System.out.println("2. Withdraw");

			System.out.println("Select the action :");
			int option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("Enter amount to deposite : ");
				int amount = sc.nextInt();
				if(amount > 0) {
				bank[i].credit(amount);
				}else {
					System.out.println("Plese Enter Amount More than Zero");
				}
				
			}
			else if(option == 2) {
				System.out.print("Enter amount to Withdraw : ");
				 int amount2 = sc.nextInt();
				 if((bank[i].getBalance() - amount2 >= 0 && amount2 > 0)) {
				bank[i].debit(amount2);
				 }else {
					 System.out.println("Don't have Sufficient Fund");
				 }
				

			}
			
			System.out.println("-----------------------------");
//			
//			switch(option) {
//			case 1:
//				System.out.print("Enter amount to deposite : ");
//				int amount = sc.nextInt();
//				bank[i].credit(amount);
//			case 2:
//				System.out.print("Enter amount to Withdraw : ");
//				 amount = sc.nextInt();
//				bank[i].debit(amount);
//			default:
//				System.out.println("Enter the Correct Option");
//			}
		}
		
		for(int i = 0 ; i < bank.length ;i++) {
			bank[i].display();
			System.out.println("---------------------------");
		}
		System.out.println("------------------");
		System.out.println("Account with Maximum Balance :");
		getMaximumBalanceAccount(bank);
		

	}

	private static void getMaximumBalanceAccount(Bank[] bank) {
		int maxBalance = bank[0].getBalance();
		int index  = 0 ;
		for(int i = 1 ; i < bank.length ;i++) {
			if(bank[i].getBalance() > maxBalance) {
				maxBalance = bank[i].getBalance();
			    index = i ;
			}
		}
		bank[index].display();
	}
}
