package com.JavaIQ;

public class PalindromeString {

	public static void main(String[] args) {
	
		//6.Write a Java Program to find whether a String is Palindrome or not?
		
		String str="kayak";
        String a="";
        for (int i = str.length()-1; i >= 0; i--) {
            a=a+str.charAt(i);   
        }
            
        if(a.equals(str)) {
            System.out.println("The string is palindrome");
        }else {
            System.out.println("The string is not palindrome");
        }
	}
}
