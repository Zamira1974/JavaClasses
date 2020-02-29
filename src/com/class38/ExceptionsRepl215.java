package com.class38;

/*Complete the Code. 
Handle the possible Exception of Number format Exception. 
in Catch block print the Exception Class using getClass method. 
and print the message using getMessage method.

Output
class java.lang.NumberFormatException
For input string: "akki"
*/
public class ExceptionsRepl215 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("akki");
			System.out.println(num);
	    } catch (NumberFormatException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
