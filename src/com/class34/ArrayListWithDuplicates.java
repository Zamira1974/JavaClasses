package com.class34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListWithDuplicates {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
	Set<String>hset=new HashSet<>();    //HashSet print all values without duplication
	hset.addAll(aList);
	System.out.println(hset);

		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		/////////////////////////////////////////////
		//How  can I remove just 1 values from the Set collection
		
		Set<String> lSet = new LinkedHashSet<>();  //keep the order
		lSet.add("Morning");
		lSet.add("Noon");
		lSet.add("Evening");
		lSet.add("Night");
		
		//convert to the Array list
		List<String> myList = new ArrayList<>();
		myList.addAll(lSet);
		String element=myList.get(2);
		System.out.println(element);
		//another way to create an Object of ArrayList by passing values to the constructor
		List<String> myList1 = new ArrayList<>(lSet);
}
}
