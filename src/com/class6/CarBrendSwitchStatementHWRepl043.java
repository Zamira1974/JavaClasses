package com.class6;

import java.util.Scanner;

public class CarBrendSwitchStatementHWRepl043 {

	public static void main(String[] args) {

/*Prompt user with questions: "Please enter your favorite car make"
if user enters  BMW -->  carOrigin = "german car"
if user enters  Toyota -->  carOrigin = " japanese car"
if user enters  Maserati -->  carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown" 
The output of your program should be:
"Your favorite car is ___"  */	
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car=sc.nextLine();
		String brend;
		
		switch(car) {
		case "BMW": 
			brend = "german car";
			break;
			
		case "Toyota": 
			brend = "japanese car";
			break;
			
		case "Maserati": 
			brend = "italian car";
			break;
			
		default: 
			brend = "unknown";
			break;
		}

		System.out.println("Your favorite car is "+brend);

	}

}
