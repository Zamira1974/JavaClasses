package com.class6;

import java.util.Scanner;

public class LargestNumAmongThreeHW {

	public static void main(String[] args) {

		/*
		 * Program to find largest number among three numbers using nested if provided
		 * by a user (numbers must be distinct)
		 */

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter your first number");
		int X = inp.nextInt();

		System.out.println("Enter your second number");
		int Y = inp.nextInt();

		System.out.println("Enter your third number");
		int Z = inp.nextInt();

		if (X > Y && X > Z) {
			System.out.println("The number " + X + " is largest among others");
		} else if (Y > X && Y > Z) {
			System.out.println("The number " + Y + " is largest among others");
		} else if (Z > X && Z > Y) {
			System.out.println("The number " + Z + " is largest among others");
		} else {
			System.out.println("The number does not meet the requirements ");
		}
	}
}
