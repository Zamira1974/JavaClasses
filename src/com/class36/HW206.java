package com.class36;
import java.util.TreeMap;

/*Create A TreeMap of Integer, Double
Add the below values

1  1.1
2  2.2
3  3.3
4  4.4
5  5.5

validate below and print the results 
is Contain Key 3?
is Contain Values 4.4?
is Contain key 6?
 **/
public class HW206 {

	public static void main(String[] args) {
		TreeMap<Integer, Double> treeMap=new TreeMap<>();
		treeMap.put(1, 1.1);
		treeMap.put(2, 2.2);
		treeMap.put(3, 3.3);
		treeMap.put(4, 4.4);
		treeMap.put(5, 5.5);
		
		
	System.out.println(treeMap.containsKey(3));
	System.out.println(treeMap.containsValue(4.4));
	System.out.println(treeMap.containsKey(6));
	}
}
		


	
	
	
	
	
	
	
	
	
