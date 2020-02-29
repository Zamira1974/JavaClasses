package com.class6;

public class LogicalOperatorHW034 {

	public static void main(String[] args) {
		
/* For you to do: 
Declare 4 int variables a, b, c and d. 
Your variable c is the result of addition of a & b. 
Variables a & b should be more than d, and c should be more than d. 

Output: 
true
true

Hint: you have 2 outputs meaning you need to have 2 printing statements
 */

		int a=15;
		int b=20;
		int d=10;
		
		int c=a+b;
		
		System.out.println(a>d&&b>d);
		System.out.println(c>d);
	}
}