package com.class6;
import java.util.Scanner;

public class CreateCalculatorSwitchHW {

	public static void main(String[] args) {
	
		/* Using scanner class create calculator.
		 * Allow user to enter 2 numbers and operator(+,-,*,/)..
		 * Based on operator provide the result to user. 
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please entrer two numbers:  ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("Enter an operator(+, -, *, /): ");
		char operator=input.next().charAt(0);
		
		double result;
		
		
		
		switch(operator)
		{
			case '+':
			result=num1+num2;
			break;
		
			case '-':
			result=num1-num2;
			break;
		
			case '*':
				result=num1*num2;
				break;
			
			case '/':
				result=num1/num2;
				break;
			default:
				System.out.println("Operator is not correct");
				return;
		}
		
		
		System.out.println("Your result is "+result);
 }
}
