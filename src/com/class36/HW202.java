package com.class36;
import java.util.HashMap;
/*
 * */
public class HW202 {

	public static void main(String[] args) {
	
		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("Street", "Patrick ST");
		infoMap.put("Suite", "265");
		infoMap.put("City", "Vienna");
		infoMap.put("Zip", "22180");
		infoMap.put("Country", "United State");
		
		System.out.println(infoMap.size());
		infoMap.clear();
		System.out.println(infoMap.size());
	}

}
