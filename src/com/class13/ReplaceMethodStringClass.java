package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		
		/*  .replace()
		 *   This method returns a new string resulting
		 *   from replacing all occurrences of oldChar
		 *   in this string with newChar.
		 */
		
		String str="Hello Dear Dan, how are you, How you been?";
		String str1="12-22-1990"; //12/22/1990
		
		/*  .replace()
		 *   This method returns a new string resulting
		 *   from replacing all occurrences of sequence of string
		 *   in this string with newCharsequence.
		 */
		System.out.println(str.replace('n','z'));      //Output: Hello Dear Daz, how are you, How you beez?
		System.out.println(str.replace(' ','k'));      //Output: HellokDearkDan,khowkarekyou,kHowkyoukbeen?
		
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replace("-", "/"));
		
		System.out.println("======================");
		System.out.println(str.replace("Dear Dan", "Respected Ben"));
		
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
		
		
		
		
	}

}
