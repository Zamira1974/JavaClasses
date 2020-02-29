package com.class6;

import java.util.Scanner;

public class ThreeStudentsSwitchStatementHWRepl041 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		int rollnumber = inp.nextInt();
		
		switch(rollnumber) {
		
		case 101: 
			System.out.println("Student name: Ramesh");
			break;
			
		case 102:
			System.out.println("Student name: Mahesh");
			break;
		
		case 103:
			System.out.println("Student name: Mukesh");
			break;
		
		default:
			System.out.println("Not found Student name: in Class");
		
		}		
	}

}
