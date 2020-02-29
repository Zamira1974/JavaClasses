package com.myPracticalWorks;

import java.util.regex.*;

public class RegexDemo {

	public static void main(String[] args) {
	
		String longString= " I know Java very well 12345 FL (890)3445630 ";
		String strangeString =  " 1Z aaa **** *** {{{ {{ {";
		
		//Word that is 2 to 20 characters in length
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
	}
	
	public static void regexChecker (String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		Matcher regexMather;
		while(regexMatcher.find()) {
			if(regexMatcher.group().length()!=0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: "+ regexMatcher.start());
			System.out.println("End Index: " + regexMatcher.end());
			
			
			
		}
		
	}
	
}
