package com.aurionpro.isp.solution.model;

public class RobotModel implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robot has start Working");
		
	}

	@Override
	public void stop() {
		System.out.println("Robot Stop working");
		
	}

}
