package com.class10;

public class EvenIndexArraysHW074 {

	public static void main(String[] args) {
	
	
	// output: 45 12 55 23 88	

		int[] arr = {45,78,12,67,55,89,23,77,88};

		for (int i=0; i<=arr.length; i+=2) {
			System.out.print(arr[i]+ " ");
		}	
	
	
	}

}
