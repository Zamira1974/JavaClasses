package com.class4;
import java.util.Scanner;

public class BooleanExpressionScannerHW {

	public static void main(String[] args) {
	
	/* For you to do: Create a Scanner class
	 * Create a program that will take a boolean value from a user. 
	 * If the input is True or False, then the output should look like below: 
	 * First Output: "Input the boolean value"
	 * Final Output: "The value is ______"  */
	
			
		Scanner bool = new Scanner(System.in);
		System.out.println("Input the boolean value");
		Boolean hello = bool.nextBoolean();
		

		if(hello) {
			System.out.println("The value is " +hello);
		}else {
		System.out.println("The value is " +hello);		
	}
}

}
