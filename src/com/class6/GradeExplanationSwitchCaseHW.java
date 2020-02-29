package com.class6;

import java.util.Scanner;

public class GradeExplanationSwitchCaseHW {

	public static void main(String[] args) {
		
		/* Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade 
		 * Not Acceptable. At the end your program should print which
		 * grade was entered by a user with explanation.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade: A, B, C or D");
		char grade=scan.next().charAt(0);
		// works only with byte, short, int, char, String
		String userGrade; 
		
		switch(grade) {
		case 'A':
			userGrade="Excellent";
			break;
		
		case 'B':
			userGrade="Good";
			break;
			
		case 'C':
			userGrade="Average";
			break;
			
		case 'D':
			userGrade="Bad";
			break;
		default:
			userGrade="Unknown";
		}
		System.out.println("Your grade is "+ userGrade);
		
	}		
}


