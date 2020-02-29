package com.myPracticalWorks;

import java.util.Arrays;

//two dimensional or multidimensional arrays 

public class MultiDimArray {

	public static void main(String[] args) {
		
		int a[][]=new int [3][2];  //3rows & 2columns
	//1.	
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;    
		
	
		System.out.println("Number of rows:" +a.length);  
		System.out.println("Number of columns:" +a[0].length);
		
		 // int a[][]= { {100,200}, {300,400}, {500,600} }; 
		
	//2.
		for (int i=0; i<a.length; i++) {              //outer loop
		for (int j=0; j<a[i].length; j++)         //inner loop
			{
			System.out.print(a[i][j]+" ");
			} 
			}
			System.out.println();
			System.out.println("***************************");
	
			
	//3.		
		int [][] grades = { {2,5,12}, {4,6,8,9}, {9,5,0,0} };	
			System.out.println(Arrays.deepToString(grades)); //Output: [[2, 5, 12], [4, 6, 8, 9], [9, 5, 0, 0]]
			
	//4.		
		int [] grade1 = { 25, 19, 35, 40, 90, 120 };	
			System.out.println(Arrays.toString(grade1));	//Output: [25, 19, 35, 40, 90, 120]
			
			
	
	}
}
