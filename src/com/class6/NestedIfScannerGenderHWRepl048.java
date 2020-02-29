package com.class6;

import java.util.Scanner;


public class NestedIfScannerGenderHWRepl048 {

	public static void main(String[] args) {

		/*
		 * Prompt user to input either "M" or "F" as a String "gender" and input any
		 * value as int "age". You have 2 conditions: If age is above 25, your inner
		 * condition, depending on your gender value, should get either "Woman" or "Man"
		 * as an output. If age is below 25, your inner condition, depending on your
		 * gender value, should get either "Girl" or "Boy" as an output. Instruction:
		 * after you run your code, start inputing your values without Prompt question
		 * to appear. Hint: your age should not be equal to 25.
		 */
		
	
		Scanner sc = new Scanner(System.in);
	
		String gender = sc.nextLine();
		int age=sc.nextInt();
	
	
		if( age > 25 ) // outer if
	    {
	      if( gender.equals("M")) {
	                System.out.println("Man");
	            } else {
	                System.out.println("Woman");
	            }
	    } 
	    else {
	            if( gender.equals("M"))    
	            {
	                System.out.println("Boy");
	            } else {
	                System.out.println("Girl");
	            }
	        
	        }    
}}
