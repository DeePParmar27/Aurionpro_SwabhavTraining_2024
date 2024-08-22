package com.aurionpro.model;

import java.util.Scanner;

public class Game {
		Player currentplayer ;
        Player[] player ;
		ResultAnalyzer resultAnalyzer ;
		Board board ;
		ResultType result = ResultType.PROCESS ;

		Player player1 = new Player("Player 1", MarkType.X);
        Player player2 = new Player("Player 2", MarkType.O);
        Player[] players = {player1, player2};
		
		
		public Game(Player currentplayer, Player[] player, ResultAnalyzer resultAnalyzer, Board board, ResultType result) {
			this.player = player;
			this.board = new Board();
			this.resultAnalyzer = new ResultAnalyzer(board, result);
			this.currentplayer = player[0];
			this.result = result;
		}

		public void setCurrentplayer(Player currentplayer) {
			this.currentplayer = currentplayer;
		}

		public void play() {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the position :");
				int i = sc.nextInt();
				int j = sc.nextInt();
				board.setCellMark(i, j, currentplayer.mark);
				board.display();				

		
				ResultType res = resultAnalyzer.analyzeResult(currentplayer);
				if(res == result.WIN) {
					System.out.println("Player :"+currentplayer.playerName+"WON");
				}
				
				switchCurrentPlayer();
				
			
		}

		

		private void switchCurrentPlayer() {
			currentplayer = currentplayer == player[0] ? player[1] : player[0];
	    }

	    public Player getCurrentPlayer() {
	        return currentplayer;
	    }

	    public ResultType getResult() {
	        return result;
	    }

	    public Board getBoard() {
	        return board;
	    }
	
		
		
		





}
		
		
		




