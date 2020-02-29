package com.class15;

public class StringManipManyExamples {
public static void main(String[] args) {
	
	//get a character at specific location
	String str="Syntax Technologies Inc";
	
	char letter=str.charAt(5);  //Returns the char value at the specified index
	System.out.println(letter);
	
	//length=19
	//System.out.println(str.charAt(str.length()));   //str.charAt(19) StringIndexOutOfBounds cause index starts from 0
	
	System.out.println(str.charAt(str.length()-1));
	
	String substr1=str.substring(0,6);
	//Technologies Inc
	String substr2=str.substring(7);
	System.out.println(substr2);
	
}
}
