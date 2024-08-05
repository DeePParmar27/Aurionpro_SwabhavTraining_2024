package com.aurionpro.model;

import javax.print.DocFlavor.STRING;

import com.aurionpro.exceptions.InsufficientBalanceException;

public class Bank {
	private int accountNumber ;
	private String name;
	private int  balance ;
	
	public void credit(int amount) {
		setBalance(balance  + amount);
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	public void debit(int amount) {
		try {
			if(balance - amount < 0) 
				throw new InsufficientBalanceException();
			setBalance(balance - amount);
		}catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
	}
	
	public Bank(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	

	
	
}
