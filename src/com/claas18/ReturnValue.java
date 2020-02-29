package com.claas18;

public class ReturnValue {

	public static void main(String[] args) {

		int n1 = 30, n2 = 66, maximum;

		maximum = max(n1, n2);
		System.out.println("maximum is " + maximum);
		System.out.println("maximum is " + max(675, 986));
	}

	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}
}
