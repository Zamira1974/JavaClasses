package com.class5;
import java.util.Scanner;

public class GradeScoreHomeWork {

	public static void main(String[] args) {
	
		
/* 1.	Write a program that will read three inputs of scores (quiz, mid term, and final scores)
*  and determine the grade based on the following rules: 
* if the average score >=90 → grade=A
* if the average score >= 70 and <90 → grade=B
* if the average score>=50 and <70 → grade=C
* if the average score<50 → grade=F */

		Scanner scan;

		int quiz, midTerm, finalScore, average ;
	
		
	
		scan=new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter midTerm");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter finalScore");
		finalScore=scan.nextInt();
		
		System.out.println("avgScore =" +  (quiz+midTerm+finalScore)/3);	
		average=scan.nextInt();
		
		average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("Grade=A");
		}
		else if (average>=70 && average<90) {
			System.out.println("Grade=B");
		}
		else if (average>=50 && average<70) {
			System.out.println("Grade=C");
		}
		else if (average<50) {
			System.out.println("Grade=D");
		}
		else {
			System.out.println("Unknown");
		}		
	}

}
