package com.review;

public class hotel {

	public static void main(String[] args) {
		
				for (int floor=1; floor<=5; floor++) {
					System.out.print("Floar "+floor + " ->");
					
					for (int room=1; room<=6; room++ ) {
						System.out.print(floor +"." + room + " ");
					}
					System.out.println();
				}
			}
	}


