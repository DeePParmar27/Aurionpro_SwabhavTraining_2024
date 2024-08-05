package com.aurionpro.behavioural.Account.test;

import java.util.ArrayList;
import java.util.List;


public class Account {
	
	private static final Account Account = null;
	private int accountNumber ;
	private String name ;
	private int balance ;
	
	List<INotifier> notifier = new ArrayList<>();
	public Account(int accountNumber, String name, int balance, List<INotifier> notifier) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifier = notifier;
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
	public List<INotifier> getNotifier() {
		return notifier;
	}
	public void setNotifier(List<INotifier> notifier) {
		this.notifier = notifier;
	}

	public void credit(int amount) {
		setBalance(balance  + amount); 
        notifier.forEach((n)->n.notify(this, "credit", amount));
}
	
	public void debit(int amount) {
		try {
			if(balance - amount < 0) 
				throw new insufficientBalanceException();
			setBalance(balance - amount);
	        notifier.forEach((n)->n.notify(this, "debited", amount));
		}catch(insufficientBalanceException e){
	        notifier.forEach((n)->n.errNotify(e.getMessage()));
		}
	}

		

}
