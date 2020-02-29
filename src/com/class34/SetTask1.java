package com.class34;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTask1 {

	public static void main(String[] args) {
	
		Set<String> hs=new TreeSet<>();
		hs.add("USA");
		hs.add("Greece");
		hs.add("Morroco");
		hs.add("Turkey");
		hs.add("Russia");
		hs.add("Uzbekistan");
		hs.add("China");
		System.out.println(hs);
		System.out.println("-----------------------------");
		
		Iterator<String>iter=hs.iterator();
		while (iter.hasNext()) {
			String element=iter.next();
			System.out.println(element);
		}
	}
}
