package com.class6;

import java.util.Scanner;

public class LogicOperScannerHWRepl037 {

	public static void main(String[] args) {

		/*
		 * For you to do: Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
		 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * Output: "Looks like you need ___ "
		 */

		Scanner inp;
		boolean thirsty;
		boolean sleepy;
		String drink;

		inp = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty = inp.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = inp.nextBoolean();

		if (thirsty && !sleepy) {
			drink = "Water";
		} else if (thirsty && sleepy) {
			drink = "Coffee";
		} else if (!thirsty && sleepy) {
			drink = "Tea";
		} else {
			drink = "Nothing";
		}

		System.out.println("Looks like you need to drink  " + drink);

	}
}
