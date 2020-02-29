package com.class36;

import java.util.LinkedHashMap;
import java.util.Iterator;

/*Create a LinkedHashMap of String. 
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all keys using iterator

Street
Suite
City
Zip
Country
 * */
public class HW205 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> infoMap = new LinkedHashMap<>();
		infoMap.put("Street", "Patrick ST");
		infoMap.put("Suite", "265");
		infoMap.put("City", "Vienna");
		infoMap.put("Zip", "22180");
		infoMap.put("Country", "United State");
		
		Iterator<String>keyIterator=infoMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
			System.out.println(itKey);
		}
	}
}
