package com.aurionpro.creational.factory.abstractmodel;

public class savingAccountFactory implements ISavingAccountFactory{

	@Override
	public IAccount accountOpening(int accountNumber, String name, int balance, int minimumBalance) {
		return new savingAccount(accountNumber, name, balance, minimumBalance);
	}


	

}
