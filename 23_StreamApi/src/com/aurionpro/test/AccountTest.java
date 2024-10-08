package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		
		
		Account account1 = new Account(1233, "Deepparmar", 1200);
		Account account2 = new Account(11891, "Harsh", 800);
		Account account3 = new Account(29990, "Nihal", 1000);
		
		
		List<Account> account = Arrays.asList(account1,account2,account3);
		
		System.out.println("Minimum Account Balance :");
	Optional<Account> minimumBalance = account.stream().min((number1 , number2)->(int) (number1.getAccountBalance()-number2.getAccountBalance()));
        
	if(minimumBalance.isPresent()) {
		System.out.println(minimumBalance.get());
	}
	
	System.out.println("Maximum Account Balance :");
	Optional<Account> maximumBalance = account.stream().max((number1 , number2)->(int) (number1.getAccountBalance()-number2.getAccountBalance()));
    
	if(maximumBalance.isPresent()) {
		System.out.println(maximumBalance.get());
	}
	account.stream().filter(name->name.getAccountName().length() >6).forEach(n->System.out.println(n));
 	
	System.out.println("Total of Account Balance :");
	int accountBalance = account.stream().map(acc ->acc.getAccountBalance()).reduce(0,(number1 , number2)->number1+number2);
     System.out.println(accountBalance);
		
	}
	
	
	

}
