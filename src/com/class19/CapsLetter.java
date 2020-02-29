package com.class19;

public class CapsLetter {

/*Complete method with the following specs:
Returns: String
Method Name: makeCapital
Parameters: String
Write logic within the method to convert the string into all CAPS.
Call method
Output:
TEST */
	
	static String makeCapital (String name) {
		return name.toUpperCase();
	}

public static void main(String [] args) {
	System.out.println(makeCapital("test"));
}
}