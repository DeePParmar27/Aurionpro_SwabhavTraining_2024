package com.aurionpro.model;

public interface MatchingPattern {

	public void columLineMatch(char[][] matrix, boolean gameOver, String player, char letter, Player play);

	public void RowLineMatch(char[][] matrix, boolean gameOver, String player, char letter, Player play);

	public void crossLineMatrix(char[][] matrix, boolean gameOver, String player, char letter, Player play);

	public void crossLineReverse(char[][] matrix, boolean gameOver, String player, char letter, Player play);

}
