package com.myPracticalWorks;
public class TwoDArray {
	public static void main(String[] args) {

		int[][] grades = { 
				{ 1, 5, 2, 8, 6, 11 }, 
				{ 8, 4, 6, 11, 4 }, 
				{ 0, 1, 3, 5, 0, 7 }, 
				{ -5, 0, 3 } 
				};
		
		System.out.println(grades[1][4]);
		System.out.println(grades.length);
		System.out.println(grades[0].length);

		System.out.println("*************************");

		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[row].length; col++) {
				System.out.print(grades[row][col] + " ");
			}
			System.out.println();
		}

	}
}
