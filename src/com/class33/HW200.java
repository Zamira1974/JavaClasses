package com.class33;

import java.util.HashSet;

public class HW200 {
/*Create a Hashset.
Just add the values as
first
second
third
fourth 
fifth 

first print the all values
then remove "second"
then print the values
Then remove all the elements.
Then Print the values. 
output
[third, fifth, fourth, first, second]
[third, fifth, fourth, first]
[]
 */
 
public static void main(String[] args) {
	HashSet<Object> in = new HashSet<>();
	 in.add("first");
	 in.add("second");
	 in.add("third");
	 in.add("fourth");
	 in.add("fifth");
	 System.out.println(in);
	
	 in.remove("second");
	 System.out.println(in);
	 
	 in.clear();
	 System.out.println(in);
	}
}
