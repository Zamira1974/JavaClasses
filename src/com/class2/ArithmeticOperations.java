package com.class2;

public class ArithmeticOperations {

/*declare 2 variables and initialize them
 * display result of addition, subtraction, multiplication and division
 */

	
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);   //30
		System.out.println(num1-num2);	 //10
		System.out.println(num1*num2);   //200
		System.out.println(num1/num2);   //2
		
		System.out.println(num1+","+num2); //20,10
		
		System.out.println(num1+""+num2);   //2010

		
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		//the addition of 2 numbers is __
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		
		String text1 = "The addition of 2 numbers is:  ";
		String text2 = "The substraction of 2 numbers is:  ";
		String text3 = "The division of 2 numbers is:  ";
		String text4 = "The multiplication of 2 numbers is:  ";
		
		System.out.println(text1 + 30);
		System.out.println(text2 + 10);
		System.out.println(text3 + 2);
		System.out.println(text4 + 200); 
		
		
		
		
		
	/* 1. Write a Java program to add, subtract, multiply and divide 2 decimal values. 
	* Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
	* 
	* 2. Write a program to find the square of the number 3.9. You program should say “The square of the
	*  ____ is ____ “
	*  
	*3. Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. 
	* Your program should say. “The perimeter of a rectangle with width ___ and height ____ 
	* is equal to _____ and the area is __”
    */
		
		int a=44; int b=22;

		 sum=a+b;
		 sub=a-b;
		 mult=a*b;
		 div=a/b;
		
		System.out.println("The addition of 2 numbers a and b is equal to  " + sum);
		System.out.println("The subtraction of 2 numbers a and b is equal to  " + sub);
		System.out.println("The multiplication of 2 numbers a and b is equal to  " + mult);
		System.out.println("The division of 2 numbers a and b is equal to  " + div);
		
	/*____________________________________________________________________________________________*/
		
		
		int c=3;
		int d=3*3;
		
		System.out.println("The square of the 3 is "+ d); 
		/*____________________________________________________________________________________________*/
		
		
	
		
		
		
	}	
}
