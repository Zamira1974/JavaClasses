package com.class21;

/**
 * @author zamiradauyekeyeva create two methods follow steps Step 1: Create
 *         first method, should be a regular method without static keyword. and
 *         have the logic to print out the following message "Programming is
 *         amazing." Step 2: Create second method. should be static method and
 *         write the logic to print out the following message: "Java is
 *         awesome." Step 3: try call this two method in main method
 * 
 *         Output: Programming is amazing. Java is awesome.
 */
public class StaticVarHW136 {

	void regular() {
		System.out.println("Programming is amazing.");
	}

	static void show() {
		System.out.println("Java is awesome.");
	}

	public static void main(String[] args) {
		StaticVarHW136 obj = new StaticVarHW136();
		obj.regular();
		show();
	}
}
