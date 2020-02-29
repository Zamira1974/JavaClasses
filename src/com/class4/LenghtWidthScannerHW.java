package com.class4;
import java.util.Scanner;

public class LenghtWidthScannerHW {

	public static void main(String[] args) {
	
	/*For you to do: 
	Write a program to take values of length and width from the user and 
	check if the shape of an object is square or rectangle. 
	
	Examples:
	Please enter the length 18
	Please enter the width 16
	The shape of your object is rectangle
	
	Please enter the length 16 
	Please enter the width 16 
	The shape of your object is square */
			
		
		Scanner var=new Scanner(System.in);
	
		System.out.println("Please enter the length");
		int length =var.nextInt();
		
		System.out.println("Please enter the width");
		int width=var.nextInt();
		
		
		if(length>width) {
			System.out.println("The shape of your object is rectangle");
		}
		else if(length==width) {
			System.out.println("The shape of your object is square");
		}		
}

}
