
package com.aurionpro.test;

import com.aurionpro.model.Task;

public class TaskTeast {
	public static void main(String[] args) {
		
		
		
		for(int i = 1 ; i < 11 ; i++) {
		Thread thread = new Thread(new Task());
		thread.start();
		}
	}

}
