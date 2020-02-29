package com.class19;

public class SubstringMeth {
/**
Create a method with following specs:  
Return Type: String
Method Name: makeThreeSubstr
Parameters:
a String called "word"
an integer called "startIndex"
an integer called "endIndex"

Then inside method write logic to return the result of substring  from "startIndex" to "endIndex" which repeated 3 times with no space.  
write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"

Examples:
makeThreeSubstr("hello",0,2) ==> result "he" repeated 3 times "hehehe"
makeThreeSubstr("shenanigans",3,7) ==>result "nani" repeated 3 times "naninaninani"
Output:
"hehehe"
"naninaninani" */

	public static String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String returnValue = "";
		for (int i = 0; i <= 2; i++) {
			returnValue += word.substring(startIndex, endIndex);
		}
		return returnValue;
	}

	// test case below (dont change):
	public static void main(String[] args) {
		String firstValue = makeThreeSubstr("hello", 0, 2);
		System.out.println(firstValue);
		String secondValue = makeThreeSubstr("shenanigans", 3, 7);
		System.out.println(secondValue);
	}
}
