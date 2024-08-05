package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number : ");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Account Name : ");
		String name = scanner.next();
		System.out.println("Enter Account Balance : ");
		int accountBalance = scanner.nextInt();

		while (true) {
             int option = currentSavingOption(scanner);
			if (option == 1) {
				System.out.println("Enter Over Draft Limit : ");
				int overDraftLimit = scanner.nextInt();
				CurrentAccount current = new CurrentAccount(accountNumber, name, accountBalance, overDraftLimit);
				int actions = takingOptions(scanner);
				while (true) {
					if (actions == 1) {
						current.credit(current.getBalance());
						return;
					}
					current.debit(current.getBalance(), overDraftLimit);
				}
			}

			SavingAccount savingAccount = new SavingAccount(accountNumber, name, accountBalance, 5000);
			int action = takingOptions(scanner);
			if (action == 1) {
				savingAccount.credit(savingAccount.getBalance());
				return;
			}

			savingAccount.debit(savingAccount.getMIN_BALANCE(), savingAccount.getBalance());

		}
	}

	private static int currentSavingOption(Scanner scanner) {
		System.out.println("Which Type of Account do you Want :");
		System.out.println("1. current");
		System.out.println("2. Saving");
		System.out.println("Select Option :");
		int option = scanner.nextInt();
		return option;
	}

	private static int takingOptions(Scanner scanner) {
		System.out.println("What type of action do you want to perform :");
		System.out.println("1. credit");
		System.out.println("2. debit");
		System.out.println("Enter Option :");
		int option = scanner.nextInt();
		return option;

	}

}
