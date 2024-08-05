package com.aurionpro.model;

public class Account {
	private int accNo ;
	private String name ;
    private int balance ;
    private int overDraftLimit ;
 
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
	public Account(int accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
    
    
}
