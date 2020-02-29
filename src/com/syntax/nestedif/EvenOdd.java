package com.syntax.nestedif;

public class EvenOdd {

	public static void main(String[] args) {
	
		
		// Write a program to find if a number is even or odd
		// Print out "My number must be even" or "My number must be odd"
		// Must use if else
	
		/*
		 * int x=5;
		 * 
		 * if(x%2==0) { System.out.println("My number must be even"); }
		 * 
		 * else { System.out.println("My number must be odd"); }
		 * 
		 */
	
		
		int a=10;
		int b=15;
		int c=35;;
		
	if (a>b && a>c) {
		System.out.println("Largest number is  "+ a);
	}else if (b>a && b>c){
		System.out.println("Largest number is  "+ b);
	}else {
		System.out.println("Largest number is  "+ c);
	}
		
	}

}
