package com.class21;

/** @author zamiradauyekeyeva

Declare below variables in your main class as below. 
int batch=3;
String InstituteName="SyntaxSolutions"
int year=2019;

then print out the variables value in main method. 
this will require creating an object of the class. 
to make use of your instance variables

Output sequence:
3
SyntaxSolutions
2019 */

public class VariablesHW129 {
	int batch = 3;
	String InstituteName = "SyntaxSolutions";
	int year = 2019;

	public static void main(String[] args) {

		VariablesHW129 obj = new VariablesHW129();
		System.out.println(obj.batch);
		System.out.println(obj.InstituteName);
		System.out.println(obj.year);
	}
}
