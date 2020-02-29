package com.class25_HW;
/*Create the two Constructor for Main class 
First Constructor method without parameter 
Second Constructor with String parameter
write code to print below sentences. 
call them in main method

Output 
Welcome to the syntax solutions
I am the student in syntax solutions */

public class Constructor {

	Constructor() {
		System.out.println("Welcome to the syntax solutions");
	}
	Constructor(String str) {
		System.out.println("I am the student in syntax solutions");
	}

	public static void main(String[] args) {
		Constructor mm = new Constructor();
		Constructor mm1 = new Constructor("Syntax");
	}
}
