package com.class6;

import java.util.Scanner;

public class CountryLanguageSwitchCaseHW {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks
		 */
		String country, language;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {

		case "Azerbaijani":
			language = "Turkic";
			break;

		case "Kongo":
			language = "Niger–Congo";
			break;

		case "Brasil":
			language = "Portuguese";
			break;

		case "Slovenia":
			language = "Hungarian";
			break;

		case "Kuwait":
			language = "Arabic";
			break;

		case "India":
			language = "Hindi";
			break;

		case "Kenya":
			language = "Swahili";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("Your country is " + country + "  and your language is " + language);

	}
}
