package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Bank;

public class BankTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Account Number");
		int accNO = scanner.nextInt();
		System.out.println("Enter Your Name :");
		String name = scanner.next();
		System.out.println("Enter your Account Balance");
		int balance = scanner.nextInt();
		
		Bank bank = new Bank(accNO, name, balance);

		
		System.out.println("Select the Option:");
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		int option = scanner.nextInt();
		if(option == 1) {
			System.out.println("Enter Amount to debit :");
			int amount = scanner.nextInt();
			bank.credit(amount);
		}else {
			System.out.println("Enter Amount to debit :");
			int amount = scanner.nextInt();
			bank.debit(amount);
		}
		
		System.out.println(bank);
		
	}

}
