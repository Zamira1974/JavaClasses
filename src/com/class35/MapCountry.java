package com.class35;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCountry {
/*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 * */
	public static void main(String[] args) {
		Map<String, String> countryMap=new TreeMap<>();
		countryMap.put("Italy", "Rome");
		countryMap.put("France", "Paris");
		countryMap.put("USA", "Washington, DC");
		countryMap.put("Brasil", "Brasilia");
		countryMap.put("Nicaragua", "Managua");
		
		//1.storing countries in alphabetical order
		Collection<String> keys=countryMap.keySet();
		System.out.println(keys);
		
		System.out.println("--------Printing all keys and values using for each loop-----------");
		//2.Print all keys and values from a country map using for each loop
		for(String key: keys) {
		System.out.println("Key is "+key +" and value is "+countryMap.get(key));
		}
		
		System.out.println("----------Printing all keys and values using iterator -------------");
		//2.2 Print all keys and values from a country map using  iterator
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("Key is "+key +" and value is "+countryMap.get(key));	
		}
		
		System.out.println("-------------Printing all values using for each loop------------");
		//3.Print all values from a country map using for each loop and iterator.
		
		Collection<String>values=countryMap.values();
		for (String value: values) {
			System.out.println(value);			
		}
		System.out.println("-------------Printing all values using iterator------------");
		
		Iterator<String>iterator=values.iterator();
		while (iterator.hasNext()) {
			String value=iterator.next();
			System.out.println(value);
		}
	}
}

