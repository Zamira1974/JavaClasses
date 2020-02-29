package com.class33;

import java.util.HashSet;

public class HW196 {
/*Set
Create a Set and and below values to it. 
[third, first, second]

Print the hashset
then remove all the elements from Hashset. 
Print the hashset
Output: 
[third, first, second]
[]   
 */
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<>();
		hash.add("third");
		hash.add("first");
		hash.add("second");
		System.out.println(hash);
		
		hash.clear();
		System.out.println(hash);	
	}
}
