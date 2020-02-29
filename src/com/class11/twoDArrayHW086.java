package com.class11;

public class twoDArrayHW086 {

	public static void main(String[] args) {

//	Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.
//
//		For example, the if we run rowSums for the following 2D array:
//		
	int [][] arr =  {{1, 1, 2}, 
		  {3, 1, 2}, 
		  {3, 5, 3}, 
		  {0, 1, 2}};  
		
	int [] sum= new int [arr.length];
	int rowSum;
	
	for (int i = 0; i < arr.length; i++) {
			rowSum=0;
         for (int j = 0; j < arr[i].length; j++) {
        	 rowSum+=arr[i][j];
         }	   
         		sum[i]=rowSum;
         		System.out.println(rowSum);
     }
  }	  		
}


