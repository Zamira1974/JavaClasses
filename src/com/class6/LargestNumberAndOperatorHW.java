package com.class6;

import java.util.Scanner;

public class LargestNumberAndOperatorHW {

	public static void main(String[] args) {

		// write a program to find largest of three double values
		//using if-else .. if provided by a user (number must be distinct)
		
		
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your first number");
		double A = inp.nextDouble();

		System.out.println("Enter your second number");
		double B = inp.nextDouble();

		System.out.println("Enter your third number");
		double C = inp.nextDouble();

		if (A > B && A > C) {
			System.out.println("The first number is largest. The number is  " + A);
		} else if (B > A && B > C) {
			System.out.println("This second number is largest. The number is  " + B);
		} else if (C > A && C > B) {
			System.out.println("This third number is largest. The number is " + C);
		} else {
			System.out.println("Number is out of our range");
		}

	}

}
