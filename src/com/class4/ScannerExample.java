package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		/*
		 * Scanner is a class in Java that will allow us to take an input from a user
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
	
		/* nextInt(); --> for numbers
		 * nextLine(); --> for Strings
         * nextDouble(); --> double */

		int number = scan.nextInt();
		System.out.println("Entered number is " + number);

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Good afternoon " + name);

	}
}
