package com.class34;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*Create a Set of cities in which you want to make
sure that insertion order is maintained.Using Iterator
remove any city that starts with “A”   */

public class SetTask2 {

	public static void main(String[] args) {

		Set<String> cityList = new TreeSet<>();
		cityList.add("London");
		cityList.add("Aberdeen");
		cityList.add("Rome");
		cityList.add("Venice");
		cityList.add("Aby Dhabi");
		cityList.add("Petersburg");
		cityList.add("Adelaide");
		cityList.add("Algiers");
		cityList.add("Tashkent");
		cityList.add("Aktobe");
		cityList.add("Deli");
		cityList.add("Aachen");
		cityList.add("Amsterdam");

		Iterator<String> it = cityList.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A"))
				it.remove();
		}
		System.out.println(cityList);
	}
}
