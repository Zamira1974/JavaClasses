package com.class6;

public class Recap {

	public static void main(String[] args) {
		
/* declare the time (1-24)
 * based in the time identify whether in morning,evening or night
 * if 11-11  --> morning
 * if 12-15  --> noon
 * if 16-20  --> evening
 * if>20  --> night
 */
	
		int time=17;
		
		String timeOfDay=null;
		
		if (time>=1 && time <=11) {
			timeOfDay="Morning";
		}
		else if (time>=12 && time <=15) {
			timeOfDay="Noon";
		}
		else if (time>=16 && time <=20) {
			timeOfDay="Evening";
		}
		else if (time>=20 && time<=24) {
			timeOfDay="Night";
		}
		else {
			System.out.println ("Your entry is invalid");
			//timeOfDay="Unknown";
		}
		System.out.println ("Time of the day is " +timeOfDay);
		
	
		}
	
	}

