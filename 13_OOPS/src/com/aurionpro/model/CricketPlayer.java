package com.aurionpro.model;

public class CricketPlayer {
	
	private int playerId;
	private String name ;
	private int numberOfMatches ;
	private int runs ;
	private int wicket ;
	
	public CricketPlayer() {
		
	}
	
	public CricketPlayer(int playerId , String name , int numberOfMatches , int runs , int wicket) {
		this.playerId = playerId ;
		this.name = name ;
		this.numberOfMatches = numberOfMatches ;
		this.runs = runs ;
		this.wicket = wicket ;
	}
	
	public int getPlayerId() {
		return playerId ;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId ;
	}
	
	public String getName() {
		return  name ;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getWicket() {
		return wicket;
	}
	
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	
	
	public double average() {
		return runs/numberOfMatches ; 
	}
	

 
	public void display() {
		System.out.println("Player ID : "+getPlayerId());
		System.out.println("Player Name :"+getName());
		System.out.println("Player Number of Matches :"+getNumberOfMatches());
		System.out.println("Player Runs :"+getRuns());
		System.out.println("Player Wickets :"+getWicket());
		System.out.println("Players Batting Average :"+average());

	}
	

}
