package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.VoterAgeException;
import com.aurionpro.model.Voter;

public class VoterTest {
	public static void main(String[] args) {

		try
		{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your VoterID :");
		int voterId = scanner.nextInt();
		System.out.print("Enter Your FirsName:");
		String voterName = scanner.next();
		System.out.print("Enter Your LastName :");
		String LastName = scanner.next();
		System.out.print("Enter Your age :");
		int voterAge = scanner.nextInt();

		Voter voter = new Voter(voterId, voterName, LastName, voterAge);
		System.out.println(voter);
		}
		catch(VoterAgeException e)
		{
			System.out.println(e.getMessage());
		}
		

	}
}
