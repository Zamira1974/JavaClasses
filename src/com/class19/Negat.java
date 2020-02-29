package com.class19;

public class Negat {
	
/*Write method with following specification:
Returns: a double
Name: negate
Parameters: a double called "num"

AND THEN  in method body write the logic to return the given number in opposite value. (if given number is positive result 
will be negative or vice versa )
Have the output be positive 2 with your input being -2.

Examples:
Given Value 4     Returned Value -4
Given Value -10     Returned Value 10
Given Value 1     Returned Value -1


Output:
2.0  */
	
//1st way	
double NegPosNum (double num) {
	 return(num = num *(-1));	
}
public static void main(String[] args) {
	Negat obj= new Negat();
	System.out.println(obj.NegPosNum(-2));
}

//2nd way
/**
static double negate (double num){
	 return (num - num ) + (-num);
	}
	public static void main(String[] args){
		System.out.println(negate(-2));
	}
*/
}
