package com.class11;

public class ClassTask4 {

	
//Create a 2D array of integer type with 3 rows and 4 columns 
//and print all values of the whole array.
	
	public static void main(String[] args) {

		int[][] nums = {
				{5,7,12,54},
				{10,20,30,55},
				{11,22,33,44}
				};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		
	}

}}
