package com.myPracticalWorks;
public class PrintAllElementInArray {
	public static void main(String[] args) {
	
		
		int [] myarray= {100,35,42,36,79,90};
		for(int element : myarray) {
		System.out.print(element + " ");
		}
		System.out.println();
	 
		System.out.println("******************");
		
		String myString="Hello World";
		int myStringLength=myString.length(); 
		System.out.println(myStringLength);
		
		System.out.println(myString.replace('e', 'o'));
		
		  
	}

}
