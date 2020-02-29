package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		// initialize test condition increment

		for (int i = 0; i <= 4; i++) {
			System.out.println("Good morning");
		}

		// print number from 1-10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// print number from 10-1
		for (int i=10; i>=1; i--) {
			System.out.println(i);
	}
	
		//increment by 5
		for (int j=0; j<=50; j+=5) {
			System.out.println(j);  //3,10,15,20,25,30....
	}
		
		//print numbers from 1 to 100 in 1 line with space
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+"  " );
		}
		
	System.out.println("*****************************************");
		
	
		//print numbers from 100 to 1 in 1 line with space
				for (int i=100; i>=0; i--) {
					System.out.print(i+"  " );
				}
	
		System.out.println("*****************************************");
				
	
		
	
				
				
				
				
	}

}
