package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	
	
	public Account(int balance) {
		this.balance = balance ;
	}

	public void setAccountNumber(int num) {
		accountNumber = num;
	}

	public void setName(String n) {
		name = n;
	}

	public void setBalance(int bal) {
		balance = bal;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public int getBlance() {
		return balance;

	}
	
    public void deposite(int amount) {
    	if(amount > 0) {
    		int newAmount = balance + amount ;
    		balance = newAmount ;
    		System.out.println("Your Account Balance : "+newAmount);
    	}
    	else {
    		System.out.println("Plese Enter Amount More than Zero");
    	}
    }
    
    
    public void withdraw(int withdrawAmount) {
    	if((balance-withdrawAmount) >= 0 && withdrawAmount > 0) {
    		int newBalance = balance-withdrawAmount ;
    		balance =  newBalance ;
    		System.out.println("Your Balance is : "+ newBalance);
    	}else {
    		System.out.println("Don't have Sufficient Fund");
    	}
    }
}
