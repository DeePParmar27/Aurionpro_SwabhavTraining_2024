package com.aurionpro.test;

import com.aurionpro.model.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread mythread1 = new MyThread("Thread1");
		MyThread mythread2 = new MyThread("Thread2");
		MyThread mythread3 = new MyThread("Thread3");
		
		mythread1.setPriority(Thread.MAX_PRIORITY);
		mythread2.setPriority(Thread.MIN_PRIORITY);
		mythread3.setPriority(Thread.MIN_PRIORITY);
		

		
		System.out.println(mythread1.isAlive());
		System.out.println(mythread2.isAlive());
		System.out.println(mythread3.isAlive());

		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName() +" -- "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	
		try {
			mythread1.join();
			mythread2.join();
			mythread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(mythread1.isAlive());
		System.out.println(mythread2.isAlive());
		System.out.println(mythread3.isAlive());

	}

}
