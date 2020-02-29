package com.review;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("hello"));
		
		System.out.println(str.contains("LL"));
		
//		String b="LL";
//		String c=b.toLowerCase();
//		str.toLowerCase().contains(c);
		
		
		boolean result1=str.startsWith("he");
		System.out.println(result1);
		boolean result2=str.startsWith("ll", 2);
		System.out.println(result2);
		
		String b="llo";
		System.out.println(str.endsWith(b));
		
		String str2= " ";
		System.out.println("Empty "+str2.isEmpty());
		
//		String str3 = str + " " + "World";
//      String str3 = str.concat(" ").concat("World  ").trim().concat("Bodies");
        String str3 = str.concat(" ").concat("World  ").concat("Bodies");
        System.out.println(str3);
		
		char result=str.charAt(3);
		System.out.println(result);
		
		String newStr=""+str.charAt(0)+str.charAt(2)+str.charAt(4);
		System.out.println(newStr);
		
		
		System.out.println(str.indexOf('l'));    //this is char
		System.out.println(str.indexOf("ll"));   //this is string
		
		String str5="fgdfmhv";
		System.out.println(str5.indexOf("m",5));   //Output: -1  means cannot find the letter
		
		
		
	}

}
