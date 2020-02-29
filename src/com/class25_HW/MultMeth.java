package com.class25_HW;
/**
 * create multiple methods  with same name but should different parameters
method1 with int type parameter
method1 with String type parameter
method1 with double type parameter
method1 with float type parameter

and write the logic in that method to print respective value based on the parameter value you passed in the method type 
and call the method in main method with values 

Output should be
100
SyntaxSolutions
100.09
200.0998
*/


public class MultMeth {

	void m1 (int a) {
		System.out.println(a);
	}
	void m1(String str) {
		System.out.println(str);
	}
	void m1(double b) {
		System.out.println(b);
	}
	void m1(Float c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		MultMeth obj=new MultMeth();
		
		obj.m1(100);
		obj.m1("SyntaxSolutions");
		obj.m1(100.09);
		obj.m1(200.0998);
	}	
}
