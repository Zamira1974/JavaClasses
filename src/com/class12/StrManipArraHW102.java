package com.class12;
import java.util.Scanner;
public class StrManipArraHW102 {

	/*
	 * The code provided in your main method will take in five Strings and save them
	 * into an array called arr. Print out the first three letters of each element
	 * of array, one per line. Note: every element of array is at least 3 letters
	 * long.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		// System.out.println("Enter names:");
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}

		// leave above alone! write your code below

		for (int j = 0; j < arr.length; j++) {
			if (arr[j].length() >= 3)
				System.out.println(arr[j].charAt(0) + "" + arr[j].charAt(1) + "" + arr[j].charAt(2));
		}
	}
}