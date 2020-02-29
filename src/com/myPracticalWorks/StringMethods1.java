package com.myPracticalWorks;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String x ="hello";                // object (instance of a class)
	//	System.out.println(x.charAt(10));  // Output: out of Bound, cause "hello" has 5 char
 		
	//String y= "Abracadabra\n\n\nCats";   //  \n means new line
		
		
		System.out.println(x);
		System.out.println(x + " and dogs");
		
		String name = "Zara";
		System.out.println(String.format("hello %s", name));   //concatenate 
		
		System.out.println(name.length());              //length() - method find long of String
		
		
		System.out.println("*******************************");
		
		String a= "yummmm...my oh my chicken pot pie";
		System.out.println(a.charAt(a.length()-1));
		
		String fullAd = a + " Now with 20% more chicken";
		System.out.println(fullAd);
		System.out.println(fullAd.contains("chicken"));
	
		System.out.println(fullAd.indexOf("my", fullAd.indexOf("my") + 1)); //skip 1st occurence m and start from y  
		// a = "yummmm...my oh my chicken pot pie". Здесь второе появившееся слово my на 15 позиции
		
		System.out.println(fullAd.lastIndexOf("my")); // last "my" also on 15 position
	}

}
