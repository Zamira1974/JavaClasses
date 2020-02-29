package com.class2;

public class FindNumber {

	public static void main(String[] args) {

		int n = 657667;

		if (n > 9 && n < 100) {
			System.out.println("This number  is a 2 digit");
		}

		else if (n >= 100 && n < 1000) {
			System.out.println("This number is a 3 digit");
		} else if (n >= 1000 && n < 10000) {
			System.out.println("This number is a 4 digit");
		} else if (n >= 10000 && n < 100000) {
			System.out.println("This number is a 5 digit");
		} else {
			System.out.println("I do not know this number");
		}

	}
}
