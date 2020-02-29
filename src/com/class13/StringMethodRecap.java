package com.class13;

public class StringMethodRecap {

	public static void main(String[] args) {
		
	// .Replace
	
	String str="Syntax Technologies is your place to study";
	System.out.println(str.replace('y', 'i'));
	
	System.out.println("**********************");
	System.out.println(str.replace("your", "My"));
	
	System.out.println("**********************");
	
	//.replaceAll
	String str2="Video provides a powerful way to help you prove your point. "
			+ "When you click Online Video, you can paste in the embed "
			+ "code for the video you want to add. ";
	
	System.out.println(str2.replaceAll("way(.*)",""));	
	
	System.out.println("**********************");
		
	String str3="237914659HELL3647O*^$*$%^&$";
	System.out.println(str3.replaceAll("[0-9]", ""));          // HELLO*^$*$%^&$
	System.out.println(str3.replaceAll("[^A-z]", ""));         // HELLO^^
	
	System.out.println(str3.replaceAll("[^0-9A-Z-a-z]", ""));  // 237914659HELL3647O
	
	System.out.println("**************");
	
	System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
	
	System.out.println("**************");
	System.out.println(str2.replaceFirst(" ", ""));
	
	System.out.println(str3.replaceAll("\\w ", ""));
	
	}

	
}
