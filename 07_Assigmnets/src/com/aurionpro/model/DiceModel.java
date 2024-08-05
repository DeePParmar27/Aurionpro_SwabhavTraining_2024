package com.aurionpro.model;

public class DiceModel {
	private double turnScore ;
	private int turn ;
	private int diceNum ;
	private double points ;
	
	
	
	public DiceModel() {
		super();
	}
	public DiceModel(Double turnScore, int turn, int diceNum, double points) {
		super();
		this.turnScore = turnScore;
		this.turn = turn;
		this.diceNum = diceNum;
		this.points = points;
	}
	public double getTurnScore() {
		return turnScore;
	}
	public void setTurnScore(double turnScore2) {
		this.turnScore = turnScore2;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public int getDiceNum() {
		return diceNum;
	}
	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	
	
	

}
