package com.class8;
public class ForLoopNumbers {

	public static void main(String[] args) {

		/*
		 * Create a for loop that prints out numbers from 0 to 12 Must not include the
		 * number 12 in the output Increment by 1 example(i++)
		 */

		for (int i = 0; i < 12; i++) {
			System.out.println(i);
		}

		for (int j = 10; j > 0; j -= 2) {
			System.out.println(j);
		}

		for (int k = 2; k <= 14; k++) {
			if (k % 2 == 0)
				System.out.println(k);
		}
		System.out.println("*******************");

//Create a for loop that prints out odd numbers from 5 to 22
//Increment by 1 example(i++)
//Must not include the number 22 in the output 

		int a = 22;
		for (int i = 5; i < a; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// Write a program that use for loop to prints multiples of 3 between
		// 1 and 20 on one line.
		// Must not include the number 20 in the output

// 1st way
		for (int b = 1; b * 3 < 20; b++) {
			if (b * 3 != 0)
				System.out.print(b * 3 + " ");
		}

//2st way
		for (int i = 1; i <= 6; i++) {
			System.out.print(i * 3 + " ");
		}
System.out.println("*******************************");
System.out.println("*******************************");



//Write a program that greets students in the morning using a for loop.
// Hint: You have 20 students to be greeted (print "Good Morning!" 
//20 times)


for (int i=0; i<20; i++)
{
	System.out.println("Good morning!");
}
	
//Write a program that prints the string "It is year: " and the years between 2010 and 2019.
//Must not include year 2019 in the output 

for (int i=2011; i<2019; i++)
{
	System.out.println("It is year "+i);
}

//Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
//Must include year 2019 in the output 


for (int i=2011; i<=2019; i++)
{
  System.out.println("Hey, it is year: ");
   System.out.println(i);
}

System.out.println("**********************");


//Write a program that prints the count down from 10 up to 1 
//and string "Happy New Year!".


	String year=("Happy New Year!");
	
	for (int i=10; i>=0; i--) {
	  if (i==0) {System.out.println(year);
	} else {
	 System.out.println(i);
	}

	}
	}
}
