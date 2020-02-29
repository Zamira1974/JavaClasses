package com.class5;

import java.util.Scanner;

public class AnnualSalaryHW {

public static void main(String [] args) { 
	
	Scanner inp = new Scanner(System.in);
	System.out.println("Do you work 5 years: true od false");
	boolean years = inp.nextBoolean();
	
	
	if (years) {
		System.out.println("Enter your annual salary");
		int salary=inp.nextInt();
		
		if(salary>50000) {
			System.out.println("The bonus is 5000");	
			} else {
				System.out.println("The bonus is 3000");
				}	
	} else {
		System.out.println("You are not eligible for the bonus");
	}
	
} 
}
