package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exception.MinimumBalanceException;

public class SavingAccount extends Account {

	Scanner sc = new Scanner(System.in);

	public SavingAccount(int accNo, String name, int balance, int mIN_BALANCE) {
		super(accNo, name, balance);
		MIN_BALANCE = mIN_BALANCE;
	}

	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(int mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}

	public void debit(int minimumBalance, int balance) {
		try {
			System.out.println("Enter amount to Withdraw :");
			int amount = sc.nextInt();
			if (balance - amount < minimumBalance) {
				throw new MinimumBalanceException();
			} else {
				balance = balance - amount;
				setBalance(balance);
				System.out.println("Your Updated Balance :" + balance);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void credit(int balance) {
		System.out.println("Enter amount to deposite :");
		int amount = sc.nextInt();
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Your Updated Balance :" + balance);
		} else {
			System.out.println("Please enter valid amount");
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [MIN_BALANCE=" + MIN_BALANCE + ", AccNo=" + getAccNo() + ", Name=" + getName()
				+ ", Balance =" + getBalance() + "]";
	}

	private int MIN_BALANCE;

}
