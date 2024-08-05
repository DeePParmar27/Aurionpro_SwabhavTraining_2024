package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exception.OverdraftLimitExceededException;

public class CurrentAccount extends Account {

	Scanner sc = new Scanner(System.in);

	private int OVER_DRAFT_LIMIT;

	public CurrentAccount(int accNo, String name, int balance, int oVER_DRAFT_LIMIT) {
		super(accNo, name, balance);
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}

	public int getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(int oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}

	public void debit(int balance , int draftLimit) {
		try {
		System.out.println("Enter amount to withdraw :");
		int amount = sc.nextInt();
		if (balance - amount <= -(draftLimit)) {
			throw new OverdraftLimitExceededException();
		} else {
			balance = balance - amount;
			setBalance(balance);
			System.out.println("Your Updated Balance " + balance);
		}}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void credit(int balance) {
		int amount = sc.nextInt();
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Your Updated Balance " + balance);
		}	

	}

	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", AccNo=" + getAccNo() + ", Name()="
				+ getName() + ", Balance=" + getBalance() + "]";
	}

}
