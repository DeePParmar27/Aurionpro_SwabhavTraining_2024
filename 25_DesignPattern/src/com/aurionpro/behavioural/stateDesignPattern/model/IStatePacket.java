package com.aurionpro.behavioural.stateDesignPattern.model;

public interface IStatePacket {
	void next(Packet packet);
	void previous(Packet packet);
	void current(Packet packet);


}
