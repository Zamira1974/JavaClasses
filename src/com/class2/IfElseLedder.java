package com.class2;

public class IfElseLedder {

	public static void main(String[] args) {

		/*
		 * boolean rain=false;
		 * 
		 * if(rain==true) { System.out.println("I will take the class online"); } else {
		 * System.out.println("I will go to the class"); }
		 *System.out.println("*******************************************");
		 */

		/*
		 * int time=3;
		 * 
		 * if(time==7) { System.out.println("I study Java"); } else if(time==8) {
		 * System.out.println("I study SDLC"); } else if(time==9) {
		 * System.out.println("I do my homework"); } else {
		 * System.out.println("It's not my study time"); }
		 */

// if the restaurant is near by I will go eat in the restaurant
// otherwise I will not eat outside

		boolean hasMoney = true;
		boolean isRestNear = false;

		if (hasMoney == false) {
			System.out.println("I will eat in the restaurant");
		} else {
			System.out.println("Can't walk long distance");
		}
	}
}
