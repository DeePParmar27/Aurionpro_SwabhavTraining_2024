package com.aurionpro.test;
import java.util.Scanner ;

public class TreasureHunt {
	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Direction :");
		String Direction = sc.next();
		
//		String Direction = "Left" ;

		
		if(Direction.equals("Left")) {
			System.out.println("Enter your Activity :");
			String Activity = sc.next();
		//	String Activity = "Wait" ;
			if(Activity.equals("Wait")) {
				System.out.println("Select one Door :");
				String Door = sc.next();	
			//	String Door = "Red" ;
				if(Door.equals("Red")) {
					System.out.println("Burned By Fire");
					System.out.println("Game Over");
				}
				else if(Door.equals("Blue")) {
					System.out.println("Eaten By Beasts");
					System.out.println("Game Over");
				}
				else if(Door.equals("Yellow")) {
					System.out.println("You Win");
				}
				else {
					System.out.println("Game Over");
				}
			}
			else {
				System.out.println("Attacked By Trout");
				System.out.println("Game Over");
			}
		}
		else if (Direction.equals("Right") ){
			System.out.println("Fall into a hole");
			System.out.println("Game Over");
		}
		
	}

}
