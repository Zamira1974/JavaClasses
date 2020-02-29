package com.class36;

import java.util.HashMap;


/*Hash Map
Create a Hash Map of String pairs 
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using loop

Remove below from Map
"ONE"
"FOUR"

Print key and values pairs using loop

OUTPUT
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 * */
public class HW207 {

	public static void main(String[] args) {
		HashMap<String, String>map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
	
		System.out.println("HashMap Before Remove :");
		for(String k : map.keySet() ) {
			System.out.println(k +" : "+map.get(k));
		}
		System.out.println("------------------");

		map.remove("ONE");
		map.remove("FOUR");
		System.out.println("HashMap After Remove :");
		for(String k : map.keySet() ) {
			System.out.println(k+" : "+map.get(k));
		}
	}
}
