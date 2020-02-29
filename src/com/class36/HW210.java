package com.class36;

import java.util.HashMap;

/*Create HashMap 
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
 map.put("mango", 40);     

Print the hash map. 
output 

{orange=50, apple=30, mango=40}
 * */
public class HW210 {

	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange",20); 
		map.put("mango", 40); 
		map.put("mango", 40);    
		map.replace("orange", 20, 50);
		System.out.println(map);
	}

}
