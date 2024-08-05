package com.aurionpro.model;

public class MatchingPatternModel implements MatchingPattern {

	@Override
	public void columLineMatch(char[][] matrix, boolean gameOver, String player, char letter, Player play) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			if (matrix[i][0] == letter  && matrix[i][1] == letter  && matrix[i][2] == letter) {
				System.out.println(player+" Has WON !!!!!!!");
			    play.setGameOver(true);
				break;
			}
		}
	}

	@Override
	public void RowLineMatch(char[][] matrix, boolean gameOver, String player, char letter, Player play) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			if (matrix[0][i] == letter && matrix[1][i] == letter && matrix[2][i] == letter) {
				System.out.println(player+" Has WON !!!!!!!");
				play.setGameOver(true);
				break;
			}
		}
	}

	@Override
	public void crossLineMatrix(char[][] matrix, boolean gameOver, String player, char letter, Player play) {
		if(matrix[0][0] == letter && matrix[1][1] == letter && matrix[2][2] == letter) {
			System.out.println(player+" Has WON !!!!!!!");
			play.setGameOver(true);
			return;
		}
		
	}

	@Override
	public void crossLineReverse(char[][] matrix, boolean gameOver, String player, char letter, Player play) {
		// TODO Auto-generated method stub
		if(matrix[0][2] == letter && matrix[1][1] == letter && matrix[2][0] == letter) {
			System.out.println(player+" Has WON !!!!!!!");
			play.setGameOver(true);
			return;
		}
	}

}
