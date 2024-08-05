package com.aurionpro.behavioural.stateDesignPattern.model;

public class Packet {
	IStatePacket state ;

	public Packet(IStatePacket state) {
		super();
		this.state = state;
	}
	
	public void next() {
		state.next(this);
	}
	public void previous() {
		state.previous(this);
	}
	public void current() {
		state.current(this);
	}
	
	public void setPacket(IStatePacket packet) {
		this.state = packet;
	}
	

}
