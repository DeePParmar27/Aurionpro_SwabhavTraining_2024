package com.aurionpro.creational.factory.abstractmodel;

public class savingAccount implements IAccount {

	private int accountNumber ;
	private String name ;
	private int balance ;
	private int minimumBalance; 
	
	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
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
	
	

	public savingAccount(int accountNumber, String name, int balance , int minimumBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minimumBalance = minimumBalance ;
	}

	@Override
	public void credit(int amount) {
		
		System.out.println("Your Account is credited with :"+amount+"----inside saving Account----");
		int currentBal = getBalance()+amount ;
		setBalance(currentBal);
		System.out.println("Your Updated Balance "+getBalance());
	}

	@Override
	public void debit(int amount) {
		
		if(balance - amount < minimumBalance) {
			System.out.println("Please Maintain Minimum Blance");
			return;
		}
		
		System.out.println("Your amount is credit with :"+amount+" inside saving Account");
		int currentBal = getBalance()-amount ;
		setBalance(currentBal);
		System.out.println("Your Updated Balance"+getBalance());
	}

}
