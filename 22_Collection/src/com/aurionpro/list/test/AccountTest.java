package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Account> accounts = new ArrayList<>();

		inputAccountInfo(scanner, accounts);

		displayInAscending(accounts);

		for (Account account : accounts) {
			System.out.println(account);
			System.out.println("-----------------------------------");
		}

		System.out.println("");
		System.out.println("Account with Maximum Balance : ");
		int maxIndex = maximumAccountBalance(accounts);
		System.out.println(accounts.get(maxIndex));

	}

	private static void displayInAscending(List<Account> accounts) {
		for (int i = 0; i < accounts.size() - 1; i++) {
			for (int j = i + 1; j < accounts.size(); j++) {
				if (accounts.get(i).getBalance() > accounts.get(j).getBalance()) {
					Account temp = accounts.get(i);
					accounts.set(i, accounts.get(j));
					accounts.set(j, temp);
				}
			}
		}

	}

	private static int maximumAccountBalance(List<Account> accounts) {
		int maxIndex = 0;
		int maxBalance = accounts.get(0).getBalance();
		for (int i = 0; i < accounts.size(); i++) {

			if (accounts.get(i).getBalance() > maxBalance) {
				maxBalance = accounts.get(i).getBalance();
				maxIndex = i;
			}

		}
		return maxIndex;

	}

	private static void inputAccountInfo(Scanner scanner, List<Account> accounts) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter Account Number :");
			int accNo = scanner.nextInt();
			System.out.print("Enter Name of Account Holder :");
			String name = scanner.next();
			System.out.print("Enter Account Balance :");
			int balance = scanner.nextInt();

			accounts.add(new Account(accNo, name, balance));
			System.out.println("-----------------------------------");

		}
	}

}
