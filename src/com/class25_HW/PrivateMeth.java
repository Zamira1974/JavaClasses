package com.class25_HW;

/* Create two private method
First method without parameter
Second method with int parameter
Write codes print out sentences as shown below. 
call them in main method. 
 
Output
private m1 method 
private m1 method with int parameter */

public class PrivateMeth {

	private void m1() {
		System.out.println("private m1 method");
	}
	private void m1(int param) {
		System.out.println("private m1 method with int parameter");
	}
	
	public static void main(String[] args) {
		PrivateMeth obj=new PrivateMeth();
		obj.m1();
		obj.m1(25);
	}	
}
