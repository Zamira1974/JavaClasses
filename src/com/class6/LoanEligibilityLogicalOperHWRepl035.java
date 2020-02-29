package com.class6;

import java.util.Scanner;

public class LoanEligibilityLogicalOperHWRepl035 {

	public static void main(String[] args) {
	
/* Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". 
Otherwise eligibility is "Unknown".
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

Output: 
"The eligibility is ____"  */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");	
		boolean cc = scan.nextBoolean();
		
		if(cc) {
		System.out.println("What is your credit score?");	
				int score=scan.nextInt();
		
			if(score<600) {
			System.out.println("The eligibility is "+ "Not eligible");	
			}
			else if (score>=600 && score<=700) {
			System.out.println("The eligibility is "+ "Maybe eligible");	
			}
			else if (score>=701 && score<=800) {
			System.out.println("The eligibility is "+ "Eligible");	
			}
			else if (score>=801 && score<=900) {
			System.out.println("The eligibility is "+ "Definitely eligible");	
			}
		
		else {
			System.out.println("The eligibility is "+ "Unknown");
		}
	}

}}
