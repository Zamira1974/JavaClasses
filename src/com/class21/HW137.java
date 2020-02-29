package com.class21;

/** @author zamiradauyekeyeva
 *We declare a static variable in of type integer in class level. using the same variable try to complete the assignment. 

Step 1: Create a static method. inside the method write the code to increment the value of count one by one. (count ++)
Step 2: Create 3 object of Main class. 
Step 3: Call the method you create above with each object one by one
Step 4: Print the variable count value 3 

Output:
3
3
3
 */

public class HW137 {
	 static int count=0;

	 public void increment() {
		 count++; 
	}
	 
public static void main(String[] args) {
	HW137 obj1=new HW137();
	HW137 obj2=new HW137();
	HW137 obj3=new HW137();
	obj1.increment();
	obj2.increment();
	obj3.increment();
	
	System.out.println(obj1.count);
	System.out.println(obj2.count);
	System.out.println(obj3.count);
	
	}
}
