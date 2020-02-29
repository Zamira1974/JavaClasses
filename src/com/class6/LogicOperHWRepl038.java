package com.class6;

import java.util.Scanner;

public class LogicOperHWRepl038 {

	public static void main(String[] args) {
		

/*
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____" */	
		
		Scanner sc;
		boolean weekend;
		String subject;
		
		sc= new Scanner(System.in);
		
		System.out.println("Is it weekend?");
		weekend=sc.nextBoolean();
		subject=sc.nextLine();
		
		if (!weekend) {
			subject="Manual Testing";	
			
		}else  {
			subject="Java";
		}
	
		System.out.println("Today you will be learning " + subject);
		
	}
}
