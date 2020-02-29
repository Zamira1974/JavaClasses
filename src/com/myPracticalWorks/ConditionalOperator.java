package com.myPracticalWorks;

public class ConditionalOperator {

	public static void main(String[] args) {

		String name = "Clare";

		// boolean welcome = name.equals("Clare") ? true : false;

		boolean welcome = false;

		if (name.toLowerCase().equals("Clare"))
			welcome = true; // single line if statement

		System.out.println("Welcome, Clare!");
		System.out.println(welcome);

	}
}
