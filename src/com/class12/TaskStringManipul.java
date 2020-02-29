package com.class12;

public class TaskStringManipul {

	public static void main(String[] args) {
	
		
		//Create two Strings and initialize them with some value.
		//implement the following methods on those strings.
		
		/* 
		sen.length();
		sen.contains(s); 
        sen.toUpperCase();
        sen.toLowerCase();
        sen.equalsIgnoreCase(anotherString);
        sen.equals();
		 */
		
		//1.
		String names="Sabrina";
		System.out.println("The length of name is ="+names.length());
		
		//2. 
		String sentence1="Today is Java Class";
		String sen1="Is java" ;
		System.err.println(sen1.contains(sentence1));
		
		System.out.println("******************************");
		
		//3.
		String str1="I LoVe Java classes"; 
		str1 =str1.toUpperCase();
		System.out.println("After: "+str1);
		
		System.out.println("******************************");
		 
		//4. 
		str1=str1.toLowerCase();
		System.out.println("After: "+str1);
		
		System.out.println("******************************");
		
		//5. 
		String str2="I LoVe JaVa Classes";
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("******************************");
		
		//6.
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
	}

}
