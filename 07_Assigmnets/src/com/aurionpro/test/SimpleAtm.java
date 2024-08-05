package com.aurionpro.test;
import java.util.*;

public class SimpleAtm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	float balance = 0 ;
	
	System.out.println("Enter your option :");
			
//	if(option == 1) {
//		System.out.println("Your current balance is: $"+balance);
//		diffrentOption();
//	}
//	else if(option ==2) {
//		System.out.print("Enter your Amount :");
//		Float depositeMoney = sc.nextFloat() ;
//		System.out.println("You have deposited :$"+depositeMoney);
//		System.out.println(" Your new balance is $"+(depositeMoney+balance));
//		diffrentOption();
//	}
//	else if(option == 3) {
//		System.out.print("Enter amount to withdraw:");
//	    float withdrawMoney  = sc.nextFloat() ;
//		System.out.println("You have withdrawn $"+withdrawMoney);
//		System.out.println(" Your new balance is $"+(balance-withdrawMoney));
//		diffrentOption();
//	}
//	else if(option == 4) {
//		System.out.println("Thank you for using the ATM. Goodbye!");
//		diffrentOption();
//	}
//	else {
//		System.out.println("Invalid input. Please select correct option");
//
//	}
	
	int option =0 ;

	while(option != 4) {
		
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");

		option = sc.nextInt() ;
	switch(option) {
	case 1 :
		System.out.println("Your current balance is: $"+balance);
		break;
	case 2 :
		System.out.print("Enter your Amount :");
		Float depositeMoney = sc.nextFloat() ;
		System.out.println("You have deposited :$"+depositeMoney);
		balance = depositeMoney+balance ;
		System.out.println(" Your new balance is $"+(balance));
		break;
	case 3 :
		System.out.print("Enter amount to withdraw:");
	    float withdrawMoney  = sc.nextFloat() ;
		System.out.println("You have withdrawn $"+withdrawMoney);
		System.out.println(" Your new balance is $"+(balance-withdrawMoney));
		break;
	case 4 :
		System.out.println("Thank you for using the ATM. Goodbye!");
		break;
	default:
		System.out.println("Invalid input. Please select correct option");
	
	}}
	
}



}
