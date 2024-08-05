package com.aurionpro.creational.factory.abstractmodel;

public class currentAccountFactory implements ICurrentAccountFactory {

	@Override
	public IAccount accountOpening(int accountNumber, String name, int balance, int overDraftLimit) {
		return new currentAccount(accountNumber, name, balance, overDraftLimit);
	}

}
