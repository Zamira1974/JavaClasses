package com.class33;
/*Create a Hashset and add below values to it. 
Red
Pink
Yellow
White
Black
print the colors 
and get total number of colors available in the set

Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 * */

import java.util.HashSet;

public class HW194 {
	public static void main(String[] args) {
	
		HashSet<String> color = new HashSet<>();
		color.add("Red");
		color.add("Pink");
		color.add("Yellow");
		color.add("White");
		color.add("Black");
		System.out.println("Original Hash Set: "+color);
		
		System.out.println("Size of the Hash Set: "+ color.size());
		
}
}
