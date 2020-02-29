package com.class19;

public class charMethod {

/*
Create a method with following specification:

Return Type: char
Method Name: getChar
Parameters:
String called "word"
Integer called "index"
Then write your logic on getChar method to Find the character 
in given String at given index number 
Examples:
getChar("hello",1) ==> 'e'  */
	
	 
	
	char getChar(String word, int index) {	
	char ch  =word.charAt(index);
	return ch;
	}

	public static void main(String[] args) {
		
		charMethod obj=new charMethod();
		char value =obj.getChar("hello",1);
		System.out.println(value);
	}
	}

	
	

