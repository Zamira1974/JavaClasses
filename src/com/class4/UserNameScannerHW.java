package com.class4;
import java.util.Scanner;

public class UserNameScannerHW {

	public static void main(String[] args) {
	
		/* For you to do: Write a program 
		 * that takes a user's name and prints it.
		 * Output: "Your name is_"+ any variable name. */

		Scanner var = new Scanner(System.in);
		System.out.println("Hello, please Enter user name");
		String name = var.nextLine();

		System.out.println("Your name is " + name);

	}
}
		

