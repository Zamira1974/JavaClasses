package com.myPracticalWorks;

import java.util.Scanner;

public class EqualsMethodWithScanner {
public static void main(String[] args) {
	
	String password="let me in";
	System.out.println("Guess the password: ");
	//input
	Scanner scanner = new Scanner(System.in);
	String guess = scanner.nextLine();
	
	System.out.println(password.equals(guess));
	
//	if(password.equals(guess)) {
//		System.out.println("Your guess was correct!");
//		return;
//		}
//	System.out.println("This is NOT always going to run!");
	
	
	if(password.toLowerCase().equals(guess.toLowerCase())) {
		System.out.println("Your guess was correct!");
	}
	else if ("don't stop believing".toLowerCase().equals(guess.toLowerCase())) {
		System.out.println("You got a second password");
	} else {
		System.out.println("This is false");
	}
  }
}
