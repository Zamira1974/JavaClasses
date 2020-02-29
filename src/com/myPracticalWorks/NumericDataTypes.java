package com.myPracticalWorks;

public class NumericDataTypes {
public static void main(String[] args) {

//	System.out.println(Double.NaN);
//	System.out.println(Math.sqrt(-1));
//	System.out.println(Double.isNaN(Math.sqrt(-1)));     // NaN means Not A Number
//	

System.out.println(Math.pow(-9999, 999999999));     // Negative infinity

System.out.println("---------------------------");
		int a=5;
		double x = (double)a/2;      //Unary operator 
		System.out.println(x);

int y=5;
int z=y++;     //or z=++y;                 //increment
System.out.println(z);    

y--;                      //decrement
System.out.println(y);

}
}
