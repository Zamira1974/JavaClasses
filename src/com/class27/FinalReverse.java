package com.class27;
import java.util.Scanner;

public class FinalReverse {
	
	public static void main(String[] args) {
		FinalReverse obj=new FinalReverse();
	 System.out.println(obj.reverseString());
	}

	public final String reverseString() {
		Scanner scan=new Scanner(System.in);
		String reverse=scan.nextLine();
		String reverseString="";
		for(int i=reverse.length()-1; i>=0; i--) {
			reverseString = reverseString + reverse.charAt(i);
	}
		return reverseString();
  }
}

