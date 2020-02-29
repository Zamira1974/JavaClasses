package com.class4;
import java.util.Scanner;

public class NameMobileAgeScannerHW {

	public static void main(String[] args) {
	
		
		Scanner var = new Scanner(System.in);	
		System.out.println("Enter your name");
		String name=var.nextLine();
		
		System.out.println("Enter your mobile number");
		String mobileNum=var.nextLine();
		
		System.out.println("Enter your age");
		int age=var.nextInt();
		
		System.out.println("Your name is "+name+ " your age is "+age+" and your mobile number is "+mobileNum);
		
		

	}

}
