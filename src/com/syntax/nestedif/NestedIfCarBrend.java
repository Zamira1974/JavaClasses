package com.syntax.nestedif;

import java.util.Scanner;

public class NestedIfCarBrend {

	public static void main(String[] args) {

 //Write a program with one int value for salary and four String values for different cars
//If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
//I want anything under 70k to be Audi A5
//I want anything under 80k to be Mercedes-Benz
//I want anything under 90k to be Jaguar
//I want anything under 100k to be Tesla
//And if you make less than 60k output to read "Save up money and wait until next year"*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your salary");
		int salary=sc.nextInt();
		String car=sc.nextLine();
		
		if (salary>50000) {
			System.out.println("You can buy a brend new car");
			if (salary<70000) {
				car="Audi A5"; 
				System.out.println("You can buy a "+car);
			}else if (salary<80000) {
				car="Mercedes Benz";
				System.out.println("You can buy a "+car);
			}else if (salary<90000) {
				car="Jaguar";
				System.out.println("You can buy a "+car);
			}else if (salary<100000) {
					car="Tesla";
					System.out.println("You can buy a "+car);
			}else if (salary<60000) {
					System.out.println("YSave up money and wait until nexy year");
				}
			
			}else {
			System.out.println("Buy used car");
		}
	
	}

}
