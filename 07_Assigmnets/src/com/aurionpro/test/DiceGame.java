package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.DiceModel;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double diceNum;
		int turn = 0;
		double points = 0;
		double turnScore = 0;

		DiceModel dicemodel = new DiceModel();

		System.out.println("Do you want to Roll :");
		String ans = sc.next();

		while (true) {

			if (ans.equals("roll")) {
				double dice = randNum();
				if (dice == 1) {
					rollEqualsToOne(turnScore);
					return;
				}
				moreThanOne(points, turnScore, sc, dice, ans, dicemodel);
				ans = takingInput(ans, sc);

			} else if (ans.equals("hold") && dicemodel.getTurnScore() < 20) {
				holdLessThanTwenty(ans, turn, dicemodel);
				ans = takingInput(ans, sc);
			} else if (ans.equals("hold") && dicemodel.getTurnScore() >= 20) {
                holdMoreThanTwenty(dicemodel, turnScore, turn);
				break;
			}

		}

	}

	private static void holdMoreThanTwenty(DiceModel dicemodel, double turnScore, int turn) {
		turnScore = dicemodel.getPoints();
		turn = dicemodel.getTurn();
		turn++;
		dicemodel.setTurn(turn);
		System.out.println("You finished in " + turn + " turns!");
		System.out.println("Game over !");
		
	}

	private static void holdLessThanTwenty(Object turnScore, int turn, DiceModel dicemodel) {
		turnScore = dicemodel.getPoints();
		turn = dicemodel.getTurn();
		turn++;
		dicemodel.setTurn(turn);
		System.out.println("Your Point For this round :" + turnScore);
		System.out.println(turn);

	}

	private static String takingInput(String ans, Scanner sc) {
		System.out.println("Do you want to Roll :");
		ans = sc.next();
		return ans;
	}

	private static void moreThanOne(double points, double turnScore, Scanner sc, double dice, String ans,
			DiceModel dicemodel) {
		points = dicemodel.getPoints() + dice;
		turnScore = points;
		dicemodel.setPoints(points);
		dicemodel.setTurnScore(turnScore);
		System.out.println(points);
	}

	private static void rollEqualsToOne(double turnScore) {
		System.out.println("Turn over. No score.");
		turnScore = 0;
		System.out.println("Your Point For this round :" + turnScore);
	}

	public static double randNum() {
		double diceNum;
		diceNum = Math.ceil(Math.random() * 6);
		return diceNum;
	}
}
