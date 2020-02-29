package com.class12;

import java.util.Scanner;

public class StringManipHW097 {

	public static void main (String[] args) {
		
// Using Scanner class input string value. 
// Print out the following: "The first 3 letters of ___ is ___"	
		
		Scanner a=new Scanner(System.in);
	    String str=a.nextLine();
	    System.out.println("the first 3 letters of "+str+ " is "+ str.substring(0,3));
		
		
	}
}
