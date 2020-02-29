package com.class19;

public class BoolMethod {

/**
  Create a method with following specification: 

Return Type: boolean
Method Name: bothEven
Parameters:
an integer called "num1"
an integer called "num2"

Then write your logic for method that will return 
true if both num1 and num2 are even OR  Return false
if one or both given numbers are not even
Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false

Output:
false 
 */	
	static boolean bothEven(int num1, int num2) {
	
			if(num1%2==0 && num2%2==0){
			  return true;
			 } else {
			   return  false;
			 }
		}
		public static void main(String[] args){
			System.out.println(bothEven(5,6)); //should be false
		}
}
