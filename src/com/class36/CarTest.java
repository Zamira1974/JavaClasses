package com.class36;
//create a car class that will have variables, methods and constructor
//create a map that will hold car number and car objects store in it

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
class Car{
	String make, model;
public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	public void display() {
		System.out.println(make +" "+model);
	}
}
public class CarTest {

	public static void main(String[] args) {
		Map<Integer, Car>mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Mercedes", "S5"));
		mapCar.put(3, new Car("Toyora", "Rav4"));
		mapCar.put(4, new Car("Tesla", "S"));
		mapCar.put(5, new Car("Lincoln", "Mkc"));
		mapCar.put(2, new Car("Honda", "Civic"));  //assigning 2 key another
	
		//display only value objects
		Collection <Car> coll=mapCar.values();
		for(Car c : coll) {
			System.out.println(c.make+"---"+c.model);
			c.display();
		}
		//map key to its corresponding values (entrySet or keySet) 		
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		for(Entry<Integer, Car> ent : set) {
		Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i+" is associated with value of "+c.make);
		}
		//using keyset to map keys to values
		Set<Integer> keySet=mapCar.keySet();
		for(int key : keySet) {
			//               Integer+      map Object--> value object (car type)   
			//System.out.println(key +"="+ mapCar.get(key).make+"_"+ mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(key+ "=" +carDetails);
		}
		//use Iterator to iterate through values, keySet, entrySet
		Iterator<Entry<Integer, Car>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Integer,Car> entry = it.next();
			int key = entry.getKey();
			Car values = entry.getValue();
			
			System.out.println(key+ " "+values.make+" "+values.model);
		}
	
	}
}
