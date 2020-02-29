package com.class6;

import java.util.Scanner;

public class SwitchStatementHWRepl039 {

	public static void main(String[] args) {

		/*
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor"
		 * 
		 * case 1: if User provided the name as Shiva as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Sandish as input it should show "Will take care of SDLC Assignment" case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment"
		 * 
		 * Other than these four names if user provide the name try to give like (James
		 * or John ) " Invalid instructor selected"
		 */

		String name, duty;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name = scan.nextLine();

		switch (name) {

		case "Shiva":
			duty = "Will take care of Java Assignment";
			break;

		case "Sandish":
			duty = "Will take care of SDLC Assignment ";
			break;

		case "Weqas":
			duty = "Will take care of Selenium Assignment";
			break;

		case "Asel":
			duty = "Will take care of every Assignment";
			break;

		default:
			duty = "Invalid instructor selected";
		}

		System.out.println(" " + duty);
	}

}
