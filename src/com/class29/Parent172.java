package com.class29;
/*Abstraction
Make parent class as abstract class
Create 2 method in parent class
first method should be abstract method
second method normal method without abstraction. and put logic of printing "Normal method2 implementation in parent class" 

Make Main class inherit to Parent class. and implements the method. 
put the logic as below for methods. 
for abstract method, put logic of printing "abstract method1 implementation in main class"

Class the methods in main. 

Output: 
abstract method1 implementation in main class
Normal method2 implementation in parent class 
 */

public abstract class Parent172 {
	
	public abstract void m1();
	
	public void m2() {
		System.out.println("Normal method2 implementation in parent class");
	}
}

