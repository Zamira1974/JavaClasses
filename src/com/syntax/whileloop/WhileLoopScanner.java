package com.syntax.whileloop;

import java.util.Scanner;

public class WhileLoopScanner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a=1;
		String name = null;
		
		while(a<=3)
		{
			System.out.println("Please enter your name");
			name=scanner.nextLine();
			a++;
		}System.out.println("Hello " + name);
	}

}
