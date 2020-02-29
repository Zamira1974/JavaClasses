package com.class6;

import java.util.Scanner;

public class NestedIfHWRepl045 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("Please enter a number");
		int x = inp.nextInt();

		if (x % 2 == 0) {
			System.out.println("Value is even");
			if (x >= 100) {
				System.out.println("Value is too large");
			} else {
				System.out.println("Value is just right");
			}
		}

		else {
			if (x <= 100) {
				System.out.println("Value is just right and is an odd number");
			} else {
				System.out.println("This is an odd number and value is too high ");
			}
		}

	}
}
