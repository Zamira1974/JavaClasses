package com.myPracticalWorks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBacics {

	public static void main(String[] args) {

		int i = 0;
		boolean done = false;

		do {
			try {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter an integer: ");
				i = input.nextInt();
				done = true;

			} catch (InputMismatchException ime) {
				System.out.println("You did not enter an Integer");
			}finally {
				System.out.println("This finally block happens whether the exception occurs or not");
			}
			
		} while (!done);

		System.out.printf("You entered %d\n", i);

	}
}
