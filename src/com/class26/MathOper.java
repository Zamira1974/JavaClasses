package com.class26;
/*Method Overriding 
Parent class create a method. name it as adding, include two int parameter (firstNumber, secondNumber)
inside method write logic to do adding operation of both parameters value and print the result. 

Child class first inherit to Parent class and then create a method. name it as adding, include two int parameter (firstNumber, secondNumber)
inside method write logic to do adding operation of both parameters value and print the result. 

In Main Class method create object with child class and call the child it's Method
pass the parameter values as 100, 200

Output:
300
 * */

public class MathOper {

	void adding(int firstNumber, int secondNumber) {
		System.out.println(firstNumber+ secondNumber);
	}
}
