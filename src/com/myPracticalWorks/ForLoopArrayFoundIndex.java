package com.myPracticalWorks;

public class ForLoopArrayFoundIndex {
	public static void main(String[] args) {

		int[] grades = { 5, 10, 15, 35, 50 };

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == 35) {
				System.out.println("Found at index " + i);
			}
		}
	}
}
