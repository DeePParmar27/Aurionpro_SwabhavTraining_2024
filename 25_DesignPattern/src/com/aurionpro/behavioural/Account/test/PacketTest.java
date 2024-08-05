package com.aurionpro.behavioural.Account.test;

import com.aurionpro.behavioural.stateDesignPattern.model.Order;
import com.aurionpro.behavioural.stateDesignPattern.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Order());
		packet.current();
		packet.next();
		packet.current();
	}

}
