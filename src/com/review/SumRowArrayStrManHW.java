package com.review;

public class SumRowArrayStrManHW {

	public static void main(String[] args) {
	
//Homework
//Create a 1-D array
//enter the sum of each row into one element of the array
//Extra (work) create a 1-D array
//enter the sum of each column into one element of the array
		
		int[][] arr= {
				{11,55,22,80},
				{8,4,3,20},
				{10,20,30,40},
				{6,7,8,9}
				};
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("sum in all rows is " + sum);

	//sum of the row	
		sum=0;
		int row=0;
		
		for (int i = 0; i < arr[row].length; i++) {
			sum+=arr[row][i];
		}
		System.out.println("sum in row "+ row + " is "+sum);
		 
		
		
	// sum of the column	
		sum=0;
		int cols=3;
		for (int i = 0; i < arr[cols].length; i++) {
			sum+=arr[i][cols];
		}
		System.out.println("sum in cols "+ cols + " is "+sum);
		
	}
}
