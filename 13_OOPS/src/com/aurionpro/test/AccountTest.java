package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.Account;

public class AccountTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Account account1 = new Account(10000) ;
	
	System.out.print("Enter Account Number:");
	int accNo = sc.nextInt() ;
	account1.setAccountNumber(accNo);
	
	System.out.print("Enter Your Name : ");
	String n = sc.next();
    account1.setName(n);
    
    System.out.println("Accont Number :"+account1.getAccountNumber());
    System.out.println("Account Holder Name: "+account1.getName());
    System.out.println("Account Balance : "+account1.getBlance());
    
    System.out.println("Enter Amount to Deposite :");
    int amount = sc.nextInt() ;
    account1.deposite(amount);
    
    System.out.println("Enter Amount to WithDraw :");
    int withdraw = sc.nextInt() ;
    account1.withdraw(withdraw);
    
    
    Account account2 = new Account(20000) ;
    System.out.print("Enter Account Number:");
	int accNo2 = sc.nextInt() ;
	account1.setAccountNumber(accNo2);
	
	System.out.print("Enter Your Name : ");
	String n2 = sc.next();
    account1.setName(n2);
    
    System.out.println("Accont Number :"+account2.getAccountNumber());
    System.out.println("Account Holder Name: "+account2.getName());
    System.out.println("Account Balance : "+account2.getBlance());
    
}
}
