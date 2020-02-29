package com.class36;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
		Map<Integer,String> linkedHashMap=new HashMap<>();
		linkedHashMap.put(1, "Monday");
		linkedHashMap.put(2, "Tuesday");
		linkedHashMap.put(3, "Wednesday");
		linkedHashMap.put(4, "Thursday");
		linkedHashMap.put(5, "Friday");
		linkedHashMap.put(8, "Saturday");
		linkedHashMap.put(null, "Monday");
		linkedHashMap.put(9, null);
		linkedHashMap.put(10, null);
	
		System.out.println(linkedHashMap);
		
///////////////////////////////////////////////////////////////
		Map<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(1, "Monday");
		treeMap.put(8, "Saturday");
		treeMap.put(2, "Tuesday");
		treeMap.put(3, "Wednesday");
		treeMap.put(4, "Thursday");
		treeMap.put(5, "Friday");
		//treeMap.put(null, "Saturday");
		treeMap.put(9, null);
		treeMap.put(10, null);
		
		System.out.println(treeMap);

///////////////////////////////////////////////////////////////		
		Map<String,String> hashTable=new Hashtable<>();  //Hashtable does not allow any null Keys and null Values
		hashTable.put("1", "Monday");
		hashTable.put("8", "Saturday");
		hashTable.put("2", "Tuesday");
		hashTable.put("3", "Wednesday");
		hashTable.put("4", "Thursday");
		hashTable.put("5", "Friday");
		//hashTable.put(null, "Friday");
		//hashTable.put("10", null);
		System.out.println(hashTable);
		
	}
}
