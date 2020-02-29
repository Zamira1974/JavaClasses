package com.class17;

public class MathOperMethods {

	int multiply(int a, int b) {
		int mult = a * b;
		return mult;
	}

	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	int subtraction(int number1, int number2) {
		int sub = number1 - number2;
		return sub;
	}

	public static void main(String[] args) {

		MathOperMethods mm = new MathOperMethods();
		
        int sum = mm.add(10, 20);
		System.out.println("Addition " + sum);

		int mult = mm.multiply(5, 6);
		System.out.println("Multiplication " + mult);

		int sub = mm.subtraction(30, 10);
		System.out.println("Subtraction " + sub);
	}

}
