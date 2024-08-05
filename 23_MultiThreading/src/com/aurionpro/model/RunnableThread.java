package com.aurionpro.model;

public class RunnableThread implements Runnable {
	
	private Thread thread;

	public RunnableThread(String name) {
		thread = new Thread(this , name);
		thread.start();
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(thread.currentThread().getName() +" -- "+ i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
