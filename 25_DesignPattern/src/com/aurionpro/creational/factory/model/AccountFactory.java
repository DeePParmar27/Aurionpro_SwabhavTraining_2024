package com.aurionpro.creational.factory.model;

public class AccountFactory{
	
	public IAccount savingAccountType(int accountNumber, String name, int balance , int minimumBalance) {
            IAccount  account = new savingAccount(accountNumber, name, balance, minimumBalance);
            return account ;
	}
	
	public IAccount currentAccountType(int accountNumber, String name, int balance , int overDraftLimit) {
        IAccount  account = new currentAccount(accountNumber, name, balance, overDraftLimit);
        return account ;
}
	
}
