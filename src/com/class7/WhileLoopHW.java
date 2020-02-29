package com.class7;

public class WhileLoopHW {

	public static void main(String[] args) {
		
/*Step 1: Initialize the i value as int i=7.
Step 2: Write a program to print a sequence of number starting from 7 to 98. 
Step 3: Think by what number it should be incremented. 
 */
		
		int j=7;
		while (j<=98) {
			System.out.println(j);
			j=j+7;
			}
		

		
		
/* Create a do while loop that prints out numbers from 10 to 20
Must not include the number 20 in the output 
Increment by 1 within the do example:
do  {
a++;
 }
 Output:
10
11
12
13
14
15
16
17
18
19 
*/	
		int a=10;
		do {
			System.out.println(a);
			a++;
		}
		while(a<20);
		

		
/*Create a do while loop that prints out "Hello World!" 5 times. 
Increment by 1 within the do example:
do  {
a++;
 }
Output:
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!  */
	  	
		int c = 1;
	    do {
	      System.out.println("Hello World!");
	      c++;
	    } while(c <= 5 );
		
		
		
	}

}
