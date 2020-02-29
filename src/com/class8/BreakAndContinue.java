package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {

		//break keyword breaks/exiist the loop
		
		 for (int i=0; i<10; i++) {
			if(i==7) {
				break;
			}
		System.out.println(i);
		}
	System.out.println("I am outside of the loop"); 
	
	
	
	System.out.println("****************************");
	
	
	//continue - it will skip CURRENT iteration
	
	for (int i=1; i<=5; i++) {
		
		if(i==3 || i==4) {
			continue;
		}
 	System.out.println(i);
	}
	System.out.println("I am outside of the loop");
	
	
	System.out.println("****************************");
	
	
	
	//I want to print nums from 1 to 20 except 5,6,7
	
	for (int a=1; a<=20; a++) {
		if (a==5 || a==6 || a==7) {
			continue;
		}
		System.out.println(a);
	
	}
}}
