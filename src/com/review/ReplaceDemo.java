package com.review;
public class ReplaceDemo {
public static void main(String[] args) {
	
	String longStr= "I am very happy today, because today is not Monday.";
	
	String anotherStr=longStr.replace('a','e');
	System.out.println(anotherStr);
	
	anotherStr=longStr.replace(',',';');
	System.out.println(anotherStr);
	
	anotherStr=longStr.replace('a','e').replace('I', 'A'); // A em very heppy todey, beceuse todey is not Mondey.
	System.out.println(anotherStr);
	
	anotherStr=longStr.replace("today", "tomorrow");
	System.out.println(anotherStr);
	
	anotherStr=longStr.replace(",", "");   //replace , with nothing
	System.out.println(anotherStr);
	
	System.out.println("****************************");
	
	anotherStr=longStr.replaceAll("a", "e");  //Replaces each substring of this string that matches the given regular expression with the given replacement.
	System.out.println(anotherStr);

	anotherStr=longStr.replaceAll("[aA]", "u"); //i want replace lower Case "a" or upper case "A" with e 
	System.out.println(anotherStr);
	
	System.out.println("****************************");

	anotherStr=longStr.replaceAll("[a-z]", "");  //all letters replace with nothing
	System.out.println(anotherStr);

	anotherStr=longStr.replaceAll("[a-z]", "1").replaceAll(" ", "2");  //all the letters replaced with 1
	System.out.println(anotherStr);
	
	
	anotherStr=longStr.replaceAll("[a-zA-Z]", "");  //all letters(lower case & upper case) replace with nothing
	System.out.println(anotherStr);
	
	System.out.println("****************************");
	
	longStr="!][{}!@!{}[]";
	anotherStr=longStr.replaceAll("[!{}!@!]", "");
	System.out.println(anotherStr);
	System.out.println("****************************");
	
	longStr="my social security is 232-34-2323";
	anotherStr=longStr.replaceAll("[0-9]", "*");   // "[0-9]" this is regular expression
	System.out.println(anotherStr);
	
	System.out.println("****************************");
	
	longStr="I want to learn Java. And I want to learn more! Is this OK?";
	anotherStr=longStr.replaceAll("[^a-zA-Z]", "+");    //  ^ means do not replace letters, but replace anything else.
	System.out.println(longStr);
	System.out.println(anotherStr);
	
	System.out.println("------------------------------------");
	
	longStr= "I am very happy today, because today is not Monday.";
	anotherStr=longStr.replaceFirst("today", "tomorrow");   //this method replace just first accurence.
	System.out.println(longStr);
	System.out.println(anotherStr);
	
	System.out.println("----Index Of ----");
	System.out.println(longStr);
	int result = longStr.indexOf("today", 32);   //-1  means it does not find "today"
	System.out.println(result);
	
}
}
