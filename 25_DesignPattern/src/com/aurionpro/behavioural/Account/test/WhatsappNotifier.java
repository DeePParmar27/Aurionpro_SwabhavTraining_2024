package com.aurionpro.behavioural.Account.test;

import java.lang.reflect.Method;

public class WhatsappNotifier implements INotifier {

	@Override
	public void notify(Account acc , String Method , int amount) {
		System.out.println("Your Account is "+Method+" this "+amount);
		System.out.println("Your current account Balance :"+acc.getBalance());	
		
	}

	@Override
	public void errNotify(String Method) {
System.out.println(Method);		
	}

}
