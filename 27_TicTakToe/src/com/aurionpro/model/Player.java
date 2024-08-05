package com.aurionpro.model;

public class Player {
 
	public char mark ;
	public boolean gameOver ;
	
	public boolean getGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public Player(char mark) {
		super();
		this.mark = mark;
	}

	public char getMark() {
		return mark;
	}

	public void setMark(int i , int j , char matrix[][]) {
		matrix[i][j] = this.mark ;
	}


	
	

}
