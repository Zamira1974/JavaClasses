package com.class12;

public class TwoDArrayHW083 {

	public static void main(String[] args) {
	
	//Write a program to print the sum of the elements in the third row. 
		
		int[][] a = {
			  {5,2,3,7},
			  {1,5,2,2},
			  {1,2,3,4}
			         };
		
		int row=2;
		int sum=0;
		for(int j = 0; j < a[row].length; j++) {
			sum=sum+a[row][j];
		}
		System.out.println(sum);

		
	}
}

