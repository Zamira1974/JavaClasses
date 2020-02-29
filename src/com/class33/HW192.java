package com.class33;

import java.util.LinkedList;

/*Create a method the return an LinkList. without parameters. 
inside the method put the logic to add below values to the linklist and return the list. 
In Main Class. 
call the method and store it to a new Linklist. 
Print the values of LinkList. 
Output
John
Brian
Ryan
 * */
class HW192{
	
	public static LinkedList<String> test(){
		
	LinkedList<String> names = new LinkedList<String>();
		names.add("John");
		names.add("Brian");
		names.add("Ryan");
		return names;
	}
	public static void main(String[] args){

   LinkedList<String> arr= test();
   for (String values : arr){
     System.out.println(values);
   }
  }	
}