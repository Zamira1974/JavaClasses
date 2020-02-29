package com.class4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		
		
		Scanner keyBInput=new Scanner(System.in);
		System.out.println("Enter your name: ");
		boolean isMale=keyBInput.hasNextBoolean();
		
		if(isMale=true) {
		System.out.println("Hey "+isMale);
		}
	}

}
