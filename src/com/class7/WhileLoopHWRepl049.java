package com.class7;

public class WhileLoopHWRepl049 {

	public static void main(String[] args) {

		/*
		 *1. Create a while loop that prints out numbers from 0 to 8 Must include the
		 * number 8 in the output Increment by 1 example(a++)  */
		int a = 0;
		while (a <=8) {
			System.out.println(a);
			a++;
		}
		System.out.println("**********************");
		
		
		/* 2. Create a while loop that prints out numbers from 0 to 15
		 * Must include the number 0 in the output 
		 * Decrement by 1 (example(a--))
		 */
		int a1=15;
		while (a1>=0) {
			System.out.println(a1);
			a1--;
		}
		System.out.println("**********************");
		
			
		
		/* 3. Create a while loops that prints out even numbers from 1 to 13
		Must not include the number 13 in the output 
		Increment by 1 - example(a++)
		*/
	
		int q=1;
		
		while (q<=13) {
			if (q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		
		System.out.println("**********************");
		
		
		/*4. Write a java program to print  "Hello Syntax Solutions! How are you?"  three times using the while loop
		Step 1: Initialize the value int i=1
		Step 2: Write the while loop conditions and print the output
		"Hello Syntax Solutions! How are you?"  three times */
		
		int i=1;
		while (i<=3) {
			System.out.println("Hello Syntax Solutions! How are you?");
			 i++;
			}
	
		System.out.println("**********************");
		
				
		/* 5. Print 1 to 10 Numbers except 7, 8, 9, 5  using the While loop
		Step 1: Initialize the i value as int i=1
		Step 2: Create the while loop to check the condition 
		Step 3: Write the if condition for validation part
		Step 4 : It should print
		1
		2
		3
		4
		6
		10 */
		
		int j=1;
		   while(j<=10)
		   {
		     if(j!=5 && j!=7 && j!=8 && j!=9) {
		     System.out.println(j);
		     }
		     j++;
		   }
		
		
		
		
		}
			
}



