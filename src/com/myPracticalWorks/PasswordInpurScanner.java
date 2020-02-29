package com.myPracticalWorks;

import java.util.Scanner;

public class PasswordInpurScanner {
public static void main(String[] args) {
	
	System.out.println("Guess the password");
	String password = "Let me in";
	Scanner sc=new Scanner(System.in);
	String guess = sc.nextLine();
	
	
	while(!guess.equals(password)) {
		System.out.println("Guess the password:");
		guess=sc.nextLine();
	}
	
	System.out.println("Congrats");
	sc.close();
}
}
