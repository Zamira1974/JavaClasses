package com.class9;

import java.util.Scanner;

public class ScannerGuessingSecretNumGame {

	public static void main(String[] args) {

		
		Scanner scan; 
		int secretNumber, guessNumber;
		
		scan = new Scanner(System.in);
		secretNumber=12;
	
		
		do {
			System.out.print("Please guess my number between 1 to 20 ");
			guessNumber = scan.nextInt();
			
			if (guessNumber < secretNumber ) {
				System.out.println("Your number is too small");
			} else if (guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			} 
		} while (guessNumber !=secretNumber);
		
		System.out.println("Congratulations! You got it.");
	}
}	

