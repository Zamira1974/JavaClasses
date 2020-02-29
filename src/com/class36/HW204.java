package com.class36;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

/*Create a HashMap of String. 
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values using entrySet in upper case. 
Output: 
265
22180
PATRICK ST
UNITED STATE
VIENNA
 * */
public class HW204 {
	public static void main(String[] args) {
		
		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("Street", "Patrick ST");
		infoMap.put("Suite", "265");
		infoMap.put("City", "Vienna");
		infoMap.put("Zip", "22180");
		infoMap.put("Country", "United State");
		
		Set<Entry<String, String>>ent=infoMap.entrySet();
		for (Entry<String, String> e : ent) {
			System.out.println(e.getValue().toUpperCase());
		}
	}
}

