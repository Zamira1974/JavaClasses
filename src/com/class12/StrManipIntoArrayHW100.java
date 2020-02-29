package com.class12;

public class StrManipIntoArrayHW100 {

	public static void main(String[] args) {

/* Create a String named "Welcome To Syntax Solutions".
Convert the String into array and using toCharArray method print all values. 
 */
	String str="Welcome to Syntax Solutions";		

	char[] arr=str.toCharArray();
	
	for(int i=0; i<arr.length; i++) {
		{
		System.out.println(arr[i]);
		}
	}
}}



