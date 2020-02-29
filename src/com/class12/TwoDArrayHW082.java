package com.class12;

public class TwoDArrayHW082 {

	public static void main(String[] args) {
			
//Write a program to double the values of every element in the array and print it out.

	double[][] a= {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
	};
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length+1; j++)
			{
				System.out.print(2*a[i][j]+ " ");
			} 
			System.out.println();
		}}
	}


