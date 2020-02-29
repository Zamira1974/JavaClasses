package com.class4;
import java.util.Scanner;

public class UserInformationScannerHW {

	public static void main(String[] args) {

		/* For you to do: Write a program to take a statement input from the user and
		 * print it.
		 * Hint: by statement we mean a sentence(any). */
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your first_name");
		String first_name = s1.nextLine();

		System.out.println("Enter your last_name");
		String last_name = s1.nextLine();

		System.out.println("Enter your email");
		String email = s1.nextLine();

		System.out.println("Enter your address");
		String address = s1.nextLine();

		System.out.println("Enter your phone_num");
		String phone_num = s1.nextLine();

	}

}
