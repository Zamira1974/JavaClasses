package com.class21;

/** @author zamiradauyekeyeva
Declare static variable in class level as below and assign it's value:
String ss="Welcome To Syntax Solutions"
then print it's value in you main method using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
Output:
Welcome To Syntax Solutions
Welcome To Syntax Solutions
Welcome To Syntax Solutions
 */


public class StaticVarHW134 {
	
	 static String ss="Welcome To Syntax Solutions";
	
	public static void main(String[] args) {
		String ss="Welcome To Syntax Solutions";
		
		System.out.println(ss); //By calling directly
		
		System.out.println(StaticVarHW134.ss);  //By using the className
		
		StaticVarHW134 obj = new StaticVarHW134();  //creating object of the class
		System.out.println(obj.ss);		
}
}
