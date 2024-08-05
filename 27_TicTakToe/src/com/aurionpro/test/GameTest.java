package com.aurionpro.test;
import java.nio.channels.GatheringByteChannel;
import java.util.Scanner;
import javax.swing.GroupLayout.ParallelGroup;
import com.aurionpro.model.MatchingPattern;
import com.aurionpro.model.MatchingPatternModel;
import com.aurionpro.model.Player;

public class GameTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		MatchingPatternModel pattern = new MatchingPatternModel();
		
		Player player1 = new Player('X');
		Player player2 = new Player('O');
		boolean gameOver = false;

		char matrix[][] = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = '_';
			}
		}

		while (!gameOver) {

			System.out.println("Enter the position---->player 1: ");
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();

			if (matrix[x1-1][y1-1] == '_') {
				player1.setMark(x1-1, y1-1, matrix);
				display(matrix);
			}
			else {
				System.out.println("Cannot Enter at that Position , Enter Diffrent one :");
				System.out.println("Enter the position---->player 1: ");
				int x3 = scanner.nextInt();
				int y3 = scanner.nextInt();
				player1.setMark(x3-1, y3-1, matrix);
				display(matrix);
			}

             pattern.columLineMatch(matrix, gameOver, "Player-1", 'X',player1);
             pattern.RowLineMatch(matrix, gameOver, "Player-1", 'X', player1);   
             pattern.crossLineMatrix(matrix, gameOver, "Player-1", 'X', player1);         
             pattern.crossLineReverse(matrix, gameOver, "Player-1", 'X', player1);			

     		for (int i = 0; i < 3; i++) {
    			for (int j = 0; j < 3; j++) {
    				matrix[i][j] = '_'
    			}
    		}
			

			if (player1.getGameOver() == true)
				break;

			System.out.println("Enter the position---->player 2: ");
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();

			
			if (matrix[x2-1][y2-1] == '_') {
				player2.setMark(x2-1, y2-1 , matrix);
				display(matrix);
			}
			else {
				System.out.println("Cannot Enter at that Position , Enter Diffrent one :");
				System.out.println("Enter the position---->player 2: ");
				int x4 = scanner.nextInt();
				int y4 = scanner.nextInt();
				player2.setMark(x4-1, y4-1, matrix);
				display(matrix);
			}
			
            pattern.columLineMatch(matrix, gameOver, "Player-2", 'O',player2);
            pattern.RowLineMatch(matrix, gameOver, "Player-2", 'O', player2);   
            pattern.crossLineMatrix(matrix, gameOver, "Player-2", 'O', player2);         
            pattern.crossLineReverse(matrix, gameOver, "Player-2", 'O', player2);	
            
           

			if (player2.getGameOver() == true)
				break;
		}

	}
	
	
	private static void display(char[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

//	private static void crossLineReverse(char[][] matrix, boolean gameOver , String player , char letter , Player play) {
//		if(matrix[0][2] == letter && matrix[1][1] == letter && matrix[2][0] == letter) {
//			System.out.println(player+" Has WON !!!!!!!");
//			play.setGameOver(true);
//			return;
//		}
//	}
//
//	private static void crossLineMatrix(char[][] matrix, boolean gameOver , String player , char letter , Player play) {
//		if(matrix[0][0] == letter && matrix[1][1] == letter && matrix[2][2] == letter) {
//			System.out.println(player+" Has WON !!!!!!!");
//			play.setGameOver(true);
//			return;
//		}
//	}
//
//	private static void RowLineMatch(char[][] matrix, boolean gameOver , String player , char letter , Player play) {
//		for (int i = 0; i < 3; i++) {
//			if (matrix[0][i] == letter && matrix[1][i] == letter && matrix[2][i] == letter) {
//				display(matrix);
//				System.out.println(player+" Has WON !!!!!!!");
//				play.setGameOver(true);
//				break;
//			}
//		}	
//	}
//
//	private static void columLineMatch(char[][] matrix, boolean gameOver , String player , char letter , Player play) {
//		for (int i = 0; i < 3; i++) {
//			if (matrix[i][0] == letter  && matrix[i][1] == letter  && matrix[i][2] == letter) {
//				display(matrix);
//				System.out.println(player+" Has WON !!!!!!!");
//			    play.setGameOver(true);
//				break;
//			}
//		}
//	}



}
