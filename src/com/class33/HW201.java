package com.class33;

import java.util.HashSet;
import java.util.Iterator;

public class HW201 {
/*Set
Create a hashset.
Add the values as
first
second
third
fourth 
fifth 
then create a logic to print the values of hashset one by one .
Output:
third
fifth
fourth
first
second  */
 public static void main(String[] args) {
	 HashSet<Object> hashSet = new HashSet<>();
	 hashSet.add("first");
	 hashSet.add("second");
	 hashSet.add("third");
	 hashSet.add("fourth");
	 hashSet.add("fifth");
	 
	 Iterator<Object> it = hashSet.iterator();
	 while (it.hasNext()) {
		 System.out.println(it.next());
	 } 
	}
}
