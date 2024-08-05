package com.aurionpro.creational.factory.abstracttest;

import com.aurionpro.creational.factory.abstractmodel.IAccount;
import com.aurionpro.creational.factory.abstractmodel.ICurrentAccountFactory;
import com.aurionpro.creational.factory.abstractmodel.ISavingAccountFactory;
import com.aurionpro.creational.factory.abstractmodel.currentAccountFactory;
import com.aurionpro.creational.factory.abstractmodel.savingAccount;
import com.aurionpro.creational.factory.abstractmodel.savingAccountFactory;

public class accountTest {
	public static void main(String[] args) {
		ISavingAccountFactory accontfactory = new savingAccountFactory();
		IAccount account = accontfactory.accountOpening(1211, "Deep_Parmar", 4000, 3000);
		account.debit(1200);

		ICurrentAccountFactory currentFactory =  new currentAccountFactory();
		IAccount current =currentFactory.accountOpening(2111, "Jiya_Parmar", 2000, 2000);
		current.debit(2000);
		
	}

}
