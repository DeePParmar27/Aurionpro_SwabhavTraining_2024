package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	CricketPlayer cp[] = new CricketPlayer[4];
	
	for(int i = 0 ; i < cp.length ; i++) {
		System.out.print("Enter ID :");
		int playerId = sc.nextInt() ;
		System.out.print("Enter Name :");
		String name = sc.next() ;
		System.out.print("Enter numberOfMatches :");
		int numberOfMatches = sc.nextInt() ;
		System.out.print("Enter Runs :");
		int runs = sc.nextInt() ;
		System.out.print("Enter Wicket :");
		int wicket = sc.nextInt() ;
		System.out.println("--------------------------------");
		cp[i] = new CricketPlayer(playerId , name ,numberOfMatches , runs , wicket);
		

	}
	
	for(int i = 0 ; i < cp.length ; i++) {
		cp[i].display();
		System.out.println("----------------------------------");
		System.out.println();
	}
	
	maximumAveragePlayer(cp);
	sortedAverage(cp);
	
	System.out.println("---------------------------------------");
	System.out.println("Sorted After Average : ");
	for(int i = 0 ; i < cp.length ; i++) {
		cp[i].display();
		System.out.println("----------------------------------");
		System.out.println();
	}
}

private static void sortedAverage(CricketPlayer[] cp) {
	// TODO Auto-generated method stub
	for(int i = 0 ; i < cp.length-1 ; i++) {
		for(int j = 1+1 ; j < cp.length ; j++) {
			if(cp[i].average() > cp[j].average()) {
				CricketPlayer temp = cp[i];
				cp[i] = cp[j] ;
				cp[j] = temp ;
				
			}
		}
	}
	
}

private static void maximumAveragePlayer(CricketPlayer[] cp) {
	// TODO Auto-generated method stub
	double max = cp[0].average();
	int index  = 0 ;
	for(int i = 1 ; i < cp.length ; i++) {
		if(cp[i].average() > max) {
			max = cp[i].average();
			index = i ;
		}
	}
	
	System.out.println("Player with Best Batting Average is : ");
	cp[index].display();
	
}


}
