package com.class16;

public class IQ6 {

	/*
	 * Step1. reverse the string Step2. compare 2 Strings: IF STRINGS ARE EQUAL --->
	 * PALINDROME ELSE ---> NOT PALINDROME
	 */
	public static void main(String[] args) {

		String original = " kayak radar kayak";
		String reversed = "";
		// 5-1=4-1
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i); // ""+k=k+a=ka+k
		}
		System.out.println(reversed);

		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}
}
