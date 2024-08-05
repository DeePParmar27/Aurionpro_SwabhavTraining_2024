package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.IAccount;

public class accountTest {
	public static void main(String[] args) {
		AccountFactory ac = new AccountFactory() ;
		IAccount type = ac.savingAccountType(12211, "Deep", 1000, 500);
		type.credit(1000);
		type.debit(1600);
		
	}

}
