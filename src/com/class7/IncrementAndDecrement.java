package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	
		
	// Increment and Decrement --> adding or substructing 1 form 	
	//VARIABLE:
		
		int a=10;
		
		a=a+1; // assignment
		a+=1; // shorhand assignment
		System.out.println(a);  // 12
		a++; // increment operator
		System.out.println(a);
		
		
		int b=10;
		b-=1;
		b--; // decrement operator
		System.out.println(b);
		
		
		//increment & decrement operators can be used
		//only with variables
		
		int c=23;
		c++;
		// 1++; compiler error invalid argument
		
		
	// Loops: -- to repeat same block of code
	/* Loops: 
		1. while
		2. do while
		for
		4. advanced for loop/ enhanced loop/ for each loop    */
		
		
		int time=8;
		
		if(time<12) { // condition is true
		System.out.println("Good morning"); //code executes 1 
		}
		System.out.println("--------------------------------------------------");
		while (time<12) {//while condition is true
		System.out.println("Good morning");	// code executes infinitely -- infinite loop
		time++;
		
		}
		
		/*  while Loop syntax
		initialize variable (should be outside of the loop)
		
		while(test variable --> true) {
		     code;}
		variable increment or decrement */

		//I want to print Good afternoon 5 times
		
		int i=-1;
		while (i<4) {
			System.out.println("Good afternoon");
			i++;
		}
		System.out.println("Outside of while loop");
		}
		
	
}














