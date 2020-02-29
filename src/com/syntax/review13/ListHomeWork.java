package com.syntax.review13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Create a List of String, the variable name should be asia
Add some Asian country names
Create another List with name europe
Add some Europian country names
Create a List of String with name africa
Add some African country names
Create a List of String with name america
Add some American country names (if you want you can split into south and north america)
Create a list of lists with variable name world and add the continents
Iterate the world and get a continent (use enhanced for loop)
Iterate the continent, get and print the countries of that continent (use iterator)
Explanation: I left step 10 empty just for fun :slightly_smiling_face:
You can have methods to create list of countries. for example:
public static List<String> getAsianList() {
}
 * */
public class ListHomeWork {
	public static void main(String[] args) {

		List<String> asia = new ArrayList<>();
		asia.add("Singapore");
		asia.add("Nepal");
		asia.add("Myanmar");
		asia.add("Cambodia");
		asia.add("Laos");

		List<String> europe = new ArrayList<>();
		europe.add("Warsaw");
		europe.add("Finland");
		europe.add("Sweden");
		europe.add("Greece");
		europe.add("Portugal");
		
		List<String> africa = new ArrayList<>();
		africa.add("Nigeria");
		africa.add("Chad");
		africa.add("Sudan");
		africa.add("Ethiopia");
		africa.add("Tanzania");

		List<String> northAmerica = new ArrayList<>();
		northAmerica.add("US");
		northAmerica.add("Canada");
		northAmerica.add("Mexico");
		northAmerica.add("Guatemala");
		northAmerica.add("Cuba");

		List<String> southAmerica = new ArrayList<>();
		southAmerica.add("Peru");
		southAmerica.add("Bolivia");
		southAmerica.add("Argentina");
		southAmerica.add("Brazil");
		southAmerica.add("Chile");

		List<List<String>> world = new ArrayList<>();
		world.add(asia);
		world.add(europe);
		world.add(africa);
		world.add(northAmerica);
		world.add(southAmerica);

		for (List<String> continents : world) {
			Iterator<String> iterator = continents.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("**==**==**==**==**==**");

		}
	}
}