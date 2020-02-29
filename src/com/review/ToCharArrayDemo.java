package com.review;

public class ToCharArrayDemo {
public static void main(String[] args) {
	
	String longStr= "I am very happy today, because today is not Monday.";
	char[] charArray=longStr.toCharArray();
	
	System.out.println(longStr.length());    //length of the method
	System.out.println(charArray.length);   // Property of charArray
	
	for(int i=0; i<charArray.length; i++) {
		System.out.print(charArray[i]);  
	}
	System.out.println();
	
	
//	for(int i=charArray.length-1;i>=0; i--) {
//		System.out.print(charArray[i]);         //reverse of an array
//	}
	
	for(char element : charArray) {
		System.out.print(element);    //you cannot do with this method - Reverse. But you can get all the elements from array
	}
	System.out.println();
	System.out.println("---->\tReplace \"a\" with \"e\"");  //  \t is for Tab
	
	System.out.println("_______________________________________");
	
	String anotherStr="";
//	anotherStr+='A';
//	anotherStr+='B';
//	anotherStr+='C';
//	System.out.println(anotherStr);
	
	
	for(char element : charArray) {
		  if(element=='a') {         //if you see 'a' replace it with 'u', otherwise left element
			  anotherStr+='u';
		  }else {
			  anotherStr+=element;
		  }
		}	  
	System.out.print(anotherStr);
	
	
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
	System.out.println("---->\nReplace \",\" with \";\"");
	anotherStr="";
	for(int i=0; i<charArray.length; i++) {
		char element = charArray[i];
		if(element == ',') {
			anotherStr +=';';
		}else {
			  anotherStr+=element;
		  }
		}
		System.out.println(anotherStr);
	
	
	
	
}
}
