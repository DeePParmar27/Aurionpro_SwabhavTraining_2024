package com.aurionpro.creational.factory.model;

public class currentAccount implements IAccount {

	
	
	private int accountNumber ;
	private String name ;
	private int balance ;
	private int overDraftLimit ;
	
	
	
	public currentAccount(int accountNumber, String name, int balance , int overDraftLimit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit ;
	}

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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

	@Override
	public void credit(int amount) {
		
		System.out.println("Your amount is credit with :"+amount+" inside Current Account");
		int currentBal = getBalance()+amount ;
		setBalance(currentBal);
		System.out.println("Your Updated Balance"+getBalance());
	}

	@Override
	public void debit(int amount) {
		if(getBalance() -amount > -(overDraftLimit) ) {
			System.out.println("It crosses the OverDraftLimit");
		}
		System.out.println("Your amount is debited with :"+amount+" inside Current Account");
		int currentBal = getBalance()-amount ;
		setBalance(currentBal);
		System.out.println("Your Updated Balance"+getBalance());

		
	}

}
