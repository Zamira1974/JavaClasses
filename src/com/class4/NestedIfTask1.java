package com.class4;

public class NestedIfTask1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.5;
		
		if (diploma) {
			System.out.println("Congratulations!!!");	
		
			if (gpa<3.5) {
			System.out.println("You should check GPA score");
		}  else if(gpa>=3.5) {
			System.out.println("You are eligible for scholarship");
		}	else {
			System.out.println("You should studied harder");
		}		
	}
		else {
				System.out.println("YOU NEED to GET A DEGREE!!!");
			}		
	}
}
