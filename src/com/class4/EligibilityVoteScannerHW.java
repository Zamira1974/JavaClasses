package com.class4;

import java.util.Scanner;

public class EligibilityVoteScannerHW {

	public static void main(String[] args) {

		/*
		 * For you to do: Write a Java program to ask the user "Please enter your age".
		 * Then the program will show if the person is eligible to vote. A person who is
		 * eligible to vote must be older than or equal to 18 years old and the program
		 * will show "You are eligible to vote". Otherwise the program will show
		 * "You are not eligible to vote".
		 * 
		 * Examples: Please enter your age 18
		 * You are eligible to vote 
		 * Please enter your age 16 
		 * You are not eligible to vote
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

}
