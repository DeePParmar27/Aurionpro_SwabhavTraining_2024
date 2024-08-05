package com.aurionpro.behavioural.stateDesignPattern.model;

public class Order implements IStatePacket {

	@Override
	public void next(Packet packet) {
		packet.setPacket(new Dispatch());
		System.out.println("Next stage is Dispatch Stage");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("There is no Previous Stage");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Order Stage");
		
	}

}
