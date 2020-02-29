package com.class4;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {

		
		/*about every statement you can read  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in first number");
		int num1 = scan.nextInt();

		System.out.println("Enter in Operator");
		String operator = scan.next();

		System.out.println("Enter in second number");
		int num2 = scan.nextInt();

		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operator.equals("/")) {
			System.out.println(num1 / num2);
		} else if (operator.equals("*")) {
			System.out.println(num1 * num2);
		} else {
			System.out.println("Invalid Operator or number entered");
		}
		scan.close();
	
	
	
	
	
	
	
	}
}


