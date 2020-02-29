package com.class12;


public class TwoDArrayHW088 {

	public static void main(String[] args) {

//	Write a program that will print the sum of all elements		 
//	in column with index 1 in 2d int array.
	
		int [][]  n= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
				};
	
	int column = 1;
	int sum = 0;
		 
	for (int row = 0; row < n.length; row++) {
		sum += n[row][column];		
		}
		System.out.println( sum );
}
}


