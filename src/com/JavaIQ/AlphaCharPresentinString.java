package com.JavaIQ;

public class AlphaCharPresentinString {

	public static void main(String[] args) {
		
	//3.Find out how many alpha characters present in a string?

		String str1= "f43gggkg3426245c6gf54634kl2";
	    String str2=(str1.replaceAll("[^A-Za-z]", ""));
	    System.out.println(str2.length());
	}

}
