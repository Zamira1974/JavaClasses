package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
	
		/*1.
		 .contains();
         This method  searches the sequence of characters in the string.
         If the sequences of characters are found,
         then it returns true otherwise returns false. */
	
		String sentence ="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("was"));
	
		
		/* 2.
		 This method tests if a string starts with the
         specified prefix beginning */
		
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with=" +str2.startsWith("It"));
		// System.out.println("Is this string starts with=" +str2.startsWith("Is",3));
			
		
		/*3.
		 * This method tests if this string ends with the specified suffix. */
		  
		System.out.println("Is this string ends with=" +str2.endsWith("class"));
		
		
		/*4.
		 *  This method checks whether a String is empty or not
		 */
		String str3="";
		System.out.println("Is this string empty= \n"+str3.isEmpty());
		String str4="Hello";
		System.out.println("Is this string empty="+str4.isEmpty());
		
		System.out.println("***********************************");
		
//		if(!str3.isEmpty()) {
//			System.out.println("This is not empty");
//		}else {
//			System.out.println("This is empty String");
//		}
		
		
		String sentence1="Each day has a promise to brighten up the day, \nBut first you must allow the sun to come your way"; 
		System.out.println(sentence1);
		
		
		/*5. 
		 * This method appends one String to the end of another.
		 This method returns a String with the value of the 
		 String  passed in to the method appended to the end   
		 of the String used to invoke this method.
		 */ 
		
		 String str5="Hello ";
		 String str6="World ";
		 String str7="People ";
		 
		 
		 System.out.println(str5+str6+str7);
		 System.out.println(str5.concat(str6).concat(str7));
		 
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		 
		 /*6.  
		  This method returns a copy of the String,
		  with leading and trailing 
		  */
		 String str8=" How are you? ";
		 System.out.println(str8.trim());
		 
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 
		 
		 /*7.
		  This method returns the character located at the String's specified index.
		  The string indexes start from zero.*/
		  String str9="We might be done early today";
		  System.out.println(str9.charAt(14));
		  
		  System.out.println("---------------------------------");
		  
		  
		  
		  /*8.
		   * This method returns the index within this string of the 
		   * first occurence of the specified character or -1
		   * if the character does not occur.
		   */
		  
		  String str10="We might mnot be done early";
		  System.out.println(str10.indexOf('m'));
		  System.out.println(str10.indexOf('m', 4));
		 
		  
	}
}
