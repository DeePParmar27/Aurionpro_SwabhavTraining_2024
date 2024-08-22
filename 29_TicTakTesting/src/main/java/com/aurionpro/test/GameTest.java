package com.aurionpro.test;

import com.aurionpro.model.Board;
import com.aurionpro.model.Cell;
import com.aurionpro.model.Game;
import com.aurionpro.model.MarkType;
import com.aurionpro.model.Player;
import com.aurionpro.model.ResultAnalyzer;
import com.aurionpro.model.ResultType;

public class GameTest {
	public static void main(String[] args) {
	
MarkType mark = null ;
		Player player1 = new Player("Player 1", MarkType.X);
        Player player2 = new Player("Player 2", MarkType.O);
        Player[] players = {player1, player2};
        ResultType result = null ;
        Board board = null;
        ResultAnalyzer res = null;
		



Game game = new Game(player1, players, res ,board , result.PROCESS);
game.play();
   

	
   
		
	}

}
