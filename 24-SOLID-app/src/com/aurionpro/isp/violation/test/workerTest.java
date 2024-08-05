package com.aurionpro.isp.violation.test;

import com.aurionpro.isp.violation.model.Iworker;
import com.aurionpro.isp.violation.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class workerTest {
	public static void main(String[] args) {
		Iworker labour = new Labour();
		labour.drink();
		labour.eat();
		
		
		Iworker robot = new Robot();
		robot.drink();
		robot.eat();
		robot.startWork();
		
	}

}
