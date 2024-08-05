package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
import com.aurionpro.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Email :");
			String email = scanner.next();
			if (!email.contains("@") || !email.contains(".")) {
				throw new EmailNotValidException();
			}
			System.out.println("Enter password :");
			String password = scanner.next();
			if (password.length() < 8 || stringCheck(password) == false) {
				throw new PasswordNotValidException();
			}

			Login login = new Login(email, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static boolean stringCheck(String password) {
		// TODO Auto-generated method stub
		char ch;
		int lowerCase = 0;
		int upperCase = 0;
		int hasDigit = 0;
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase = 1;
			} else if (Character.isLowerCase(ch)) {
				lowerCase = 1;

			} else if (Character.isDigit(ch)) {
				hasDigit = 1;

			}
		}

		if (lowerCase == 1 && upperCase == 1 && hasDigit == 1) {
			return true;
		} else {
			return false;
		}

	}

}
