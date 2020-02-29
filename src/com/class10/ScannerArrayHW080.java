package com.class10;

import java.util.Scanner;

public class ScannerArrayHW080 {

	public static void main(String[] args) {
		
/*Create an int array with the size of 5 and input values with Scanner. 
Create a loop and enter values into one loop (don't print prompt question for Scanner). 
Create the second loop to print the values and it must be multiplied by 10.
Print out each element of the array multiplied by ten, one element per line.
*/		

		Scanner inp = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=inp.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]*10);
	}

	}

}
