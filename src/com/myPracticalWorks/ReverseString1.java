package com.myPracticalWorks;

public class ReverseString1 {

	public static void main(String[] args) {
		String s1 = "I love Java";
		
		int size=s1.length();
		String reverse="";
		
		for(int i=size-1; i>=0; i--) {
		 reverse=reverse + s1.charAt(i);
		 }

		if (s1.equals(reverse)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("The string is not Palindrome");
		}
		
		System.out.println(reverse);
	}
}
