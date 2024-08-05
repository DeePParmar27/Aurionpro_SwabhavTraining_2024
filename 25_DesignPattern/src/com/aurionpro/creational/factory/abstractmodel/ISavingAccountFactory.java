package com.aurionpro.creational.factory.abstractmodel;

public interface ISavingAccountFactory {
	public IAccount accountOpening(int accountNumber, String name, int balance , int minimumBalance); 

}
