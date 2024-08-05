package com.aurionpro.behavioural.Account.test;

public interface INotifier {
	
 void notify(Account acc , String method , int amount);
 void errNotify(String Method);
}
