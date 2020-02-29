package com.class5;

public class PersonHeight {

	public static void main(String[] args) {
		
	/* Prompt the user to enter person heights in inches.
	 *  Person should be classified as one of the following:
        short (under 5 feet)
        medium(5 to 6 feet)
        tall (6 feet and over) */	
	
		int feet =9;
		
		if(feet==4 || feet==5) {
			System.out.println("The height is short");
		} else if(feet==5 || feet==6) {
			System.out.println("The height is medium");
		} else if(feet==6 || feet==8) {
			System.out.println("The height is tall");
		} 
		  else {
			System.out.println("Invalid height");
		}
		
		
		
		
	}

}
