package com.class10;

public class CountryArraySecondOption {

	public static void main(String[] args) {

		String[] countries = {"Kazakhstan", "Uzbekistan", "Italy", "Russia" };

		for (int i = 0; i < countries.length; i++) {

			switch (countries[i])  {
			case "Kazakhstan":
				System.out.println("Astana");
			break;
			
			case "Uzbekistan":
				System.out.println("Tashkent");
			break;
			
			case "Italy":
				System.out.println("Rome");
			break;
			
			case "Russia":
				System.out.println("Moscow");
			break;
		
			}
			
		}
	}

}
