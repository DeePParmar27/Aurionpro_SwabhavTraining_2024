package com.aurionpro.model;

public class inThreadModel {
public static void main(String[] args) {
	
	Q q = new Q();
	new Producer(q);
	new Consumer(q);
	
}	
}	

class Q{
	int number ;
	boolean value = false ;

	
	synchronized void setNumber(int number) {
		while(value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.number = number;
        value= true ;
		System.out.println("PUT : "+number);
		notify();
	}
	
	synchronized int getNumber() {
		while(!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET : "+number);
		value = false ;
		notify();
		return number;
	}


}


class Producer implements Runnable {

	Q q;
	Thread thread;

	Producer(Q q) {
		this.q = q;
		thread = new Thread(this, "Producer");
		thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			q.setNumber(i++);
		}

	}
}

class Consumer implements Runnable{
	
	Q q ;
	Thread thread ;
	
	Consumer(Q q) {
		this.q = q ;
		thread  = new Thread(this , "Consumer");
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			q.getNumber();
		}
		
	}
	
	
	
}


