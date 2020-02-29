package com.class4;
import java.util.Scanner;

public class AskUserAgeScanner {

	public static void main(String [ ] args){
		
		Scanner scan = new Scanner(System.in); // Create a Scanner object
		System.out.println("Please Enter your age");

		int age = scan.nextInt();
		
		System.out.println("Your age after 10 years is  "+ (age + 10));
		
	
		
		
	}
}
