package com.aurionpro.behavioural.stateDesignPattern.model;

public class Deliverd implements IStatePacket {

	@Override
	public void next(Packet packet) {
		System.out.println("Packet is already Delivered ");

	}

	@Override
	public void previous(Packet packet) {
		packet.setPacket(new Dispatch());
		System.out.println("Previous Stage is Dispatch");
	}

	@Override
	public void current(Packet packet) {
		
		System.out.println("Packet is in Delivered Stage");
	}

}
