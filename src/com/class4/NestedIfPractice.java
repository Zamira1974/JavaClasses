package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 13;

//if today is Friday one day I want to check if it day of 13

		if (isFriday) {
			System.out.println("Today is Friday");

			if (day == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch comedy");
			}
		} else {
			System.out.println("Today is NOT Friday");
		}
	}
}