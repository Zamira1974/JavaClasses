package com.class9;
import java.util.Scanner;

public class SumOddEvenNumScannerHW {

	public static void main(String[] args) {

		// write a program that reads a range of
		// integers(start and end point), provided by
		// a user and then from that range prints the
		// sum of the even and odd integers

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");

		int firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber = sc.nextInt();

		int start = 0;
		int end = 0;

		if (firstNumber < secondNumber) {
			start = firstNumber;
			end = secondNumber;
		} else {                      //assuming firstNumber is > secondNumber
			start = secondNumber;
			end = firstNumber;
		}

		
		int even = 0;
		int odd = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("The sum of even numbers " + even);
		System.out.println("The sum of odd numbers " + odd);

	}
}
