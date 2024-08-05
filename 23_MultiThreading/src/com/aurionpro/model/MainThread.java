package com.aurionpro.model;

public class MainThread {
public static void main(String[] args) {
	
	Thread thread = Thread.currentThread();
	System.out.println(thread);
	
	thread.setName("MainThread");
	
	for(int i = 0 ; i < 5 ; i++) {
		System.out.println(thread.currentThread().getName() +" -- "+ i);
		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


}
