package com.aurionpro.test;
import java.util.Scanner ;

public class WordGusser {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String word = "abcd" ;
	int length = word.length() ;
	int lives = length*3;
	int trials = 0 ;
	
	char[] guessWord = new char[length];
	
	for(int i = 0 ; i < length ; i++) {
		guessWord[i] = '_';
	}
	
	// System.out.println(word.charAt(2));
	int flag = 1 ;
	while(trials < lives) {
		System.out.print("ENTER THE WORD :");
		trials++;
		char guess = sc.nextLine().charAt(0);
		
		for(int i = 0 ; i < length ;i++ ) {
			if(word.charAt(i) == guess) {
				guessWord[i] = guess ;
				flag = 0 ;
				System.out.println(guessWord);
			}
			
		}
		
		if(String.valueOf(guessWord).equals(word)) {
			System.out.println("Congratulation you have won");
			break;
			
		}
		
		if(flag == 1) {
			
			System.out.println("You have lost One turn");
		}
		
		flag = 1;
			
		
	}
	
	System.out.println("Game Over");
		
	}
}
