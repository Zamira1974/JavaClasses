package com.class28;

import java.util.Scanner;

/*Create a final method. the final method should have no return type. 
 In the final method create logic to reverse 2 numbers. for instance a=12 and b =10. 
 I want b to have the value of 12 and a to have the value of 10. DO NOT REASSIGN the values, 
 you must create logic where they both swap numbers.
THIS IS A SCANNER INPUT.

Input: 
12
10

Output:
a is now assigned value of 10
b is now assigned value of 12
 * */

public class FinalReverseHW{
	
	public static void main(String[] args) {
		
		FinalReverseHW obj=new FinalReverseHW();
		obj.numberSwap();
	}
	public final void numberSwap() {
		
		Scanner inp = new Scanner(System.in);
		int a=inp.nextInt();
		int b=inp.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is now assigned value of "+a);
		System.out.println("b is now assigned value of "+b);
	}	
}
 
 


