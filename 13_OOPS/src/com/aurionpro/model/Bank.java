package com.aurionpro.model;

import javax.sound.midi.Soundbank;

public class Bank {
	private long accountNumber ;
	private String name ;
	private int balance ;
	AccountType accountType ;
	
	public Bank() {
		
	}
	
	public Bank(long accountNumber , String name , int balance , AccountType accountType ) {
		this.accountNumber = accountNumber ;
		this.name = name ;
		this.balance = balance ;
		this.accountType = accountType ;
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + ", getAccountNumber()=" + getAccountNumber() + ", getName()=" + getName()
				+ ", getBalance()=" + getBalance() + ", getAccountType()=" + getAccountType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public void credit(int amount) {
		balance = balance + amount ;
		setBalance(balance);
		System.out.println("You Account Balance :"+balance);
	}
	
	public void debit(int amount) {
		balance = balance - amount ;
		setBalance(balance);
		System.out.println("You Account Balance :"+balance);
	}
	
	public void display() {
		System.out.println("Account Number :"+getAccountNumber());
		System.out.println("Account Holder :"+getName());
		System.out.println("Account balance :"+getBalance());
		System.out.println("Account Type :"+getAccountType());
	}

}
