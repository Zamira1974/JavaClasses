package com.class12;

public class TwoDArrayHW085 {

	public static void main(String[] args) {

//Write a program that checks if a 2-D integer array is a square array, meaning, 
//if its rows and columns are equal.

		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
				};
	
		boolean Square = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a.length == a[i].length){
				Square = true;
			}
			break;
		}
		System.out.println(Square);
		    
			}
	}	


		
				

        
      

	


