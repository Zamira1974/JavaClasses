package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	
		ArrayList<String>strList= new ArrayList<>();
		
		strList.add("Montana");
		strList.add("New Hempshpire");
		strList.add("Nebraska");
		strList.add("Oregon");
		strList.add("Uta");
		
		//retrieve values from an ArrayList
		//1 way - for loop
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}

		//2 way - using enhanced for loop
		for(String name:strList) {
			System.out.println(name);
		}
		
		//3 way - using Iterator
		Iterator<String>it=strList.iterator(); 
		
		
	}
}
