package com.class8;

import java.util.Scanner;

public class CreditCardBreakContinue {

	public static void main(String[] args) {
	
	String cardString;
	Scanner scan = new Scanner(System.in);
	
		
		for(int j=0; j<=10; j++) {
			System.out.println("Are you apply to a credit card?");
			String card =scan.nextLine();
			
			if (card.equalsIgnoreCase("Yes")) {
				break;
			}
			}
	
		}	
	}

