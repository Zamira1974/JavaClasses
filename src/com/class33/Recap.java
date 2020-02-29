package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
	
	//lets create an ArrayList to store numbers
	ArrayList<Integer>numbers=new ArrayList<>();
	numbers.add(1);
	numbers.add(10);
	numbers.add(100);
	numbers.add(1000); //index=3. size=4
	
	int size=numbers.size(); //4
	System.out.println(size);
	
	//add more
	numbers.add(10000);
	//remove
	numbers.remove(size-1);//3
	numbers.remove(1);
	System.out.println(numbers);
	
	//retrieve value from an arrayList
	
	int element = numbers.get(0);
	System.out.println(element);
	
	//1way. for loop
	
	for(int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	
	//2 way. advanced loop
	
	for(int num:numbers) {
		System.out.println(num);
	}
	System.out.println("-----------------------");
	
	//I want to get values backward
	for(int i=numbers.size()-1; i>=0; i--) {
		System.out.println(numbers.get(i));
	}
	System.out.println("-----------------------");
	
	//3 way. using Iterator
	Iterator<Integer>iterator=numbers.iterator();
	
	while(iterator.hasNext()) {
		int number=iterator.next(); //autounboxing
		
		if(number%2==0) {
			System.out.println(number);
		}
	}
	
	
}
}
