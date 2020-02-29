package com.class21;

//step 1: Declare an instance variable in class level as below.
//int intNumber; 
//step 2: in your main method assign the value
//assign value of 200 to declared variable. 
//Step 3: write logic in main method to add 200 to value of declared variable. 
//and store the result in same variable.
//Step 4: Print the result value. 

//Hint: you just need one variable (intNumber). 
//Output:
//400

public class InstanceVarHW132 {
	int intNumber;

	public static void main(String[] args) {
		InstanceVarHW132 value = new InstanceVarHW132();
		value.intNumber = 200;
		value.intNumber = value.intNumber + 200;

		System.out.println(value.intNumber);
	}
}
