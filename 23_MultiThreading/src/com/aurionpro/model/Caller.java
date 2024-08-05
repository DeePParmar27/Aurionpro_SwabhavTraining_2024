package com.aurionpro.model;

public class Caller implements Runnable{
	
	
	private String message ;
	private callMe target ;
	private Thread thread ;
	
	
	public Caller(String message, callMe target) {
		this.message = message;
		this.target = target;
		thread = new Thread(this);
		thread.start();
		
	}
	
	public Thread getThread() {
		return thread ;
	}
	
	@Override
	public void run() {
		synchronized(target) {
		target.call(message);
		}
		
	}

}
