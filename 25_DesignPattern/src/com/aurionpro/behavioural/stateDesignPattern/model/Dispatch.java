package com.aurionpro.behavioural.stateDesignPattern.model;

public class Dispatch implements IStatePacket {

	@Override
	public void next(Packet packet) {
		packet.setPacket(new Deliverd());
         System.out.println("Next Stage in Delivered Stage");
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacket(new Order());
		System.out.println("Previous Stage was Order");// TODO Auto-generated method stub
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Dispatch Stage");
		
	}

}
