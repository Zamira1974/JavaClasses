package com.class36;
import java.util.Collection;
import java.util.HashMap;

/*Create A hash Map of type pairs of String. 

Add below pairs 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values using loop and KeySet. 
Output. 
265
22180
Patrick ST
United State
Vienna
 * */
public class HW203 {

	public static void main(String[] args) {
	
		HashMap<String, String> hMmap=new HashMap<>();
		hMmap.put("Street", "Patrick ST");
		hMmap.put("Suite", "265");
		hMmap.put("City", "Vienna");
		hMmap.put("Zip", "22180");
		hMmap.put("Country", "United State");
		
		Collection<String> values=hMmap.values();
		for(String val: values) {
			System.out.println(val);
		}
	}
}
