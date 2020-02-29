package com.class16;

public class IQ5 {
	
	 /* Write a program to reverse String?
	 * Reverse a string word by word?
	 */

	public static void main(String[] args) {

		String given = "Welcome to the Java class";
		/*
		 * to reverse String split(); Step1: split --> array of String Step2: use for
		 * loop and use decrement to print values
		 */

		String reversed = "";
		String[] str = given.split("\\s");
		for (int i = str.length - 1; i >= 0; i--) {
			reversed = reversed + str[i] + " ";
		}
		System.out.print(reversed);
		System.out.println();
		
		//Write a java program to reverse String?
		//toCharArray(); charAt();
		
		String given1="Today is Java Class";
		String replaced1="";
		char[] charArray=given1.toCharArray();
		for (int j=charArray.length-1; j>=0;  j--) {
			replaced1=replaced1 + charArray[j];
			}
			System.out.print(replaced1);
		

		System.out.println("----Using charAt()-----");
			
		String str1="Today is very interesting topic"; 
		for (int i=str1.length()-1; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}
		
		
		
	}
}
