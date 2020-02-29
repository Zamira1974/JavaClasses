package com.class21;

/**
 * Declare a variable in class SubClass as shown below: Protected int
 * integerNumber = 222; Then in class Subclass create a void method with
 * protected access modifier that will print the value of above declared
 * variable. then in class Main try to call the method you just created twice
 * and run the program. Output hint: 222 222
 */

class AccessModHW128 {
	protected int integerNumber = 222;

	void printNumber() {
		System.out.println(integerNumber);
	}

	public static void main(String[] args) {
		AccessModHW128 subObject = new AccessModHW128();
		subObject.printNumber();
		subObject.printNumber();
	}
}
