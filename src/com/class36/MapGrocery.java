package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapGrocery {
/*Create a Map of Groceries that will store products and it's 
 *quantities and we want maintain the insertion order for keys
 * */
	public static void main(String[] args) {
	
		Map<String, Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Apple", 5);
		groceryMap.put("Apple", 8);
		groceryMap.put("Orange",12);
		
		//retrieve single value
		groceryMap.get("Apple");
		
		//verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsKey(2);
		
		//how to retrieve all values?
		Collection<Integer> values=groceryMap.values();
		for(Integer val: values) {
			System.out.println(val);
			
		Iterator<Integer> valIt=values.iterator();
		while(valIt.hasNext()) {
			System.out.println(valIt.next());

		//get all keys and map them to values (milk -->2)
		//	Set<String> keys=groceryMap.keySet();
			for(String k : groceryMap.keySet()) {
				System.out.println(k.toUpperCase()+"--->"+groceryMap.get(k));
			}
			Iterator<String>keyIterator=groceryMap.keySet().iterator();
			while(keyIterator.hasNext()) {
				String itKey=keyIterator.next();
				Integer val1=groceryMap.get(itKey);
				
				System.out.println(itKey.toLowerCase()+ "-->" +val1);
			}
			////get all keys and map them to values (milk -->2) using entrySet
			Set<Entry<String, Integer>>entr=groceryMap.entrySet();
			for (Entry<String, Integer> e : entr) {
				System.out.println(e.getKey()+"--->"+e.getValue());
			}
		 }		
	  }
   }
}