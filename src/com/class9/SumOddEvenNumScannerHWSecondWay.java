package com.class9;

import java.util.Scanner;

public class SumOddEvenNumScannerHWSecondWay {

	public static void main(String[] args) {

		// write a program that reads a range of
		// integers(start and end point), provided by
		// a user and then from that range prints the
		// sum of the even and odd integers

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");

		int start = sc.nextInt();
		System.out.println("Enter end number");
		int end = sc.nextInt();

		int even = 0;
		int odd = 0;

		if (start<=end) {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even = even + i;
				} else {
					odd = odd + i;
				}
			}
			System.out.println("The sum of even numbers " + even);
			System.out.println("The sum of odd numbers " + odd);

		} else {// if 1num > 2 num
			System.out.println("Please enter start# less then end number");
		}
	}
}
