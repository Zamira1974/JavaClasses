package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		
		//There are two ways to create objects.
		
		//1 way. String Literal
		String name="John";
		System.out.println(name);
		System.out.println("The length of name is ="+name.length());
		
		
		//2 way. creating String with key word
		String name1=new String("John1");
		System.out.println(name1);
	
		/* This method returns the length of this string.
		 * The length is equal the the number
		 * of 16-bit Unicode characters in the string.
		 * 
		 */ 
		int name1Len=name1.length();
		System.out.println("The length of name1Len is ="+ name1Len);
			
		System.out.println("=============================");
		
		String str1="HeLlO World";
		System.out.println("Before: "+str1);
		
		// .toLowerCase()
		//This method converts all of the characters in this String to lower case
		str1=str1.toLowerCase();
		System.out.println("After: "+str1);
		
		System.out.println("******************************");
		
		
		//.equals()
		//This method will count everything such capitalization and compare the content only
		String str2="HeLlO World";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
	
		//.equalsIgnoreCase();
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		/* .toUpperCase()
		 * This method converts all of the characters in this String to upper case
		 */
		String str3="Mohammad";
		System.out.println("Before: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		
		
	}

}
