package com.class12;

import java.util.Scanner;

public class StrManipForLoopsHW104 {

	public static void main(String[] args) {
	
/* Write a for loop that will print out every other 
   letter in a String, starting with the first letter.
   These letters should be printed all on one line with no space in between.
 
   Input: SSyynnttaaxxTTeecchhnnoollooggiieess
   Output: SyntaxTechnologies
  */		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();

	    for(int i=0;i<=word.length()-1;i+=2){
		      System.out.print(word.charAt(i));
	    	  } 
	     System.out.println();
	    
	    
	}

}
