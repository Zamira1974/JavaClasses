package com.class33;
/*Set
Create a Hashset. 
Add the below values 
null
shiva 
sandish
asel
sumair  
print the values and than 
Check the set contain a null value. 
print the result of check. 
output  */

import java.util.HashSet;
public class HW199 {
	
public static void main(String[] args) {

HashSet <Object> hs = new HashSet<>();
	hs.add("null");
	hs.add("asel");
	hs.add("shiva");
	hs.add("sandish");
	hs.add("sumair");
	
	System.out.println(hs);
	
	hs.clear();
	System.out.println(hs.isEmpty());

	//2nd.way
	//boolean isContainNull = hs.contains(null);
	//System.out.println(isContainNull);
	}
}

