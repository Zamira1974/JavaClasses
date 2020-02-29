package com.class21;
//Declare two variable as shown below, one should be instance variable the other one should be local variable. 
//Instance Variable
//String student="John"
//Local variables
//int batch=3
//and then print them in main method as below sequence. 
//Output: 
//John
//3

public class VariablesHW130 {
	String student = "John";

	public static void main(String[] args) {
		int batch = 3;
		VariablesHW130 ins1 = new VariablesHW130();
		System.out.println(ins1.student);
		System.out.println(batch);
	}
}
