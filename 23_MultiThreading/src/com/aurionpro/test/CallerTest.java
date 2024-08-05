package com.aurionpro.test;

import com.aurionpro.model.Caller;
import com.aurionpro.model.callMe;

public class CallerTest {
	public static void main(String[] args) {
		 
		callMe target = new callMe();
		 Caller caller1 = new Caller("Hello", target);
		 Caller caller2 = new Caller("Deep", target);
		 Caller caller3 = new Caller("Parmar", target);
		 
		 try {
			caller1.getThread().join();
			caller2.getThread().join();
			caller3.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
