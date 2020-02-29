package com.class36;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HW211 {

	public static void main(String[] args) {

		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> appleMap = new TreeMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		dataList.add(appleMap);

		Map<String, Object> orangeMap = new TreeMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		dataList.add(orangeMap);
		double totalPurchase = 0;

		for (Map<String, Object> myMap : dataList) {
			String item = myMap.get("Items").toString();
			double price = Double.parseDouble(myMap.get("Price").toString());
			double quantity = Double.parseDouble(myMap.get("Quantity").toString());
			double subTotal = price * quantity;
			System.out.println(
					"Items: " + item + " Price: " + price + " Quantity: " + quantity + " Subtotal: " + subTotal);
			totalPurchase += subTotal;
		}
		System.out.println("Your purchase total : " + totalPurchase);
	}

}
