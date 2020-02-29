package com.class28;
/*In Parent class. 
Create a constructor, it will take a String parameter called city. 
include the logic of printing the parameter value. 
Create another constructor without parameter. 
Include the logic of printing "Parent Constructor". 

in Child class. 
Inherit to Parent class. 
Create a constructor. it will take a parameter called city.  
Then call the constructor with city parameter. try to pass the child constructor parameter to second super constructor. 

In Main class. 
Create one object of child class. pass the parameter value as "Vienna". run the application. 

Output:

Vienna 
 */


public class ParentHW {
	public ParentHW(String city) {
		System.out.println(city);
	}
	public ParentHW() {
		System.out.println("Parent constructor");
	}
}	


//inherit  to class ChildHW	
	

