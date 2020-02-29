package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Create a Map that will store Employee name and salary.
 Write a logic to retrieve an employee who gets the highest
 salary. Output should be in the below format
John Smith=$100000 */

public class Task2 {
	public static void main(String[] args) {

		Map<String, Integer> empMap = new LinkedHashMap<>();
		empMap.put("John Smith", 100000);
		empMap.put("Tahir Ablazov", 95000);
		empMap.put("Inna Rakova", 40000);
		empMap.put("Alia Asenova", 75000);

		int maxSalary = 0;
		Collection<Integer> empCol = empMap.values();
		for (int salary : empCol) {
			if (salary > maxSalary) {
				maxSalary = salary;
			}
		}
		// System.out.println(maxSalary);

		Set<Entry<String, Integer>> entry = empMap.entrySet();
		for (Entry<String, Integer> ent : entry) {
			if (ent.getValue() == maxSalary) {
				System.out.println(ent);
			}
		}
	}
}