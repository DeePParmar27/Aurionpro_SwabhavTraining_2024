package com.aurionpro.creational.singleton.model;

public class Login {
	
	private static Login login ;
	
	public Login() {
		System.out.println("Login Created");
	}
	
	public void Status() {
		System.out.println("Login Successful");
	}
	
	public static Login getLogin() {
		if(login == null)
		login = new Login();
		return login ;
	}

}
