package com.class38;
/*Exceptions 
Create a method with below Specification. 
Method Label: comparingNumber. 
return type: void
parameter:  integer number.

Method logic: 
If the given number is greater that 10, Print out  "Number is greater that 10"
else 
throw exception and say "Number is less than 10"
Handle exceptions in method using try and catch block and print the message only. 
In Main method Call the method and pass 9 as parameter. 

Ouptut: 
Number is less than 10  */


public class ExceptionsRepl214 {
	
	public static void main(String[] args) {
		
		comparingNumber(9);
	}

	public static void comparingNumber(int num) {
		try {
			if(num>10) {
			System.out.println("Number is greater than 10");
		} else {  
			throw new RuntimeException("Number is less than 10");
		} 
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}		
	}
}




