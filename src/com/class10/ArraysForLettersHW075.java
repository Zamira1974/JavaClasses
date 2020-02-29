package com.class10;

public class ArraysForLettersHW075 {

	public static void main(String[] args) {
		
//1. output: syntax	
		
				char [] letters = {'s','a','y','b','n','c','t','d','a','e','x'};
			
				for(int i=0; i<=letters.length-1; i+=2) {
					System.out.print(letters[i]);
				}	
					System.out.println();
				
					
				
//2. Write a program that creates an array of strings with the following 
//values{"This", "is", "array", "of", "strings"} and prints all values in one line.					
//Output:  This is array of strings

					
				String [] words= {"This", "is", "array", "of", "strings"};
		
				for(int i=0; i<=words.length-1; i++)
				{
					System.out.print (words[i]+" ");
				}
				

	}

}
