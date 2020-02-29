package com.class35;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TaskBestBuyEntrySet {
/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 * */
	public static void main(String[] args) {
	
		Map<Integer, String>storeMap=new LinkedHashMap<>();
		storeMap.put(7664847, "Printer");
		storeMap.put(7879885, "TV");
		storeMap.put(7765555, "Display");
		storeMap.put(7990876, "Fax");
		storeMap.put(7555580, "Laptop");
		System.out.println(storeMap);
		
		System.out.println("------Retrieve all keys and values using EntrySet with for each loop------");
		
		for(Entry<Integer, String>entry: storeMap.entrySet()) {
			String element=entry.getKey()+" = " +entry.getValue();
			System.out.println(element);	
		}
		System.out.println("------Retrieve all keys and values using EntrySet with iterator------");
		Iterator<Entry<Integer, String>>storeIterator=storeMap.entrySet().iterator();
		while(storeIterator.hasNext()) {
			Entry<Integer, String>singleEntry=storeIterator.next(  );
			Integer key=singleEntry.getKey(); 
			String value=singleEntry.getValue();
			System.out.println(key.toString()+" ----- "+value);
		}	
	}
}
