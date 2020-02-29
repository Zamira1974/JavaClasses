package com.class13;

public class ClassTask2 {

	public static void main(String[] args) {

//Task1. Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";
		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}

//Task2.Create a String and if the String is not empty perform the following: 
//if the String has an odd number of characters and has 3 or more characters, 
//print the character in the middle of the String.

		
		String str1="Hellourwe"; 
		
		int lenght=str1.length();
		int middle=str1.length()/2;
		
		System.out.println();
		if(!str1.isEmpty()) {
			if(lenght%2!=0 && lenght>=3) {
			System.out.println(str1.charAt(middle));
			}
		}
		
}

	}
