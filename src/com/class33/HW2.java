package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {
/*Create an arrayList of words.
Remove every word that ends with 'e'. Use iterator	
*/
	
	public static void main(String[] args) {
	
		List<String>list=new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		if(it.next().endsWith("e")) {
			it.remove();
//			break;    after 1st element it breaks loops, не удалит след.елемент, заканчивающийся на е
		} 
	}
	System.out.println(list);	
  }
}
