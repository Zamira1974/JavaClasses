package com.syntax.whileloop;

public class WhileLoopEvenNumber {
	public static void main(String[] args) {

	//1.
		int i = 1;
		{

			while (i <= 20) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
				i++;
			}
		}

		
		
	//2.
		
		int j = 5;
		{
			while (j <= 25) {
				System.out.print(" " + j);
				j++;
			}
		}
		
		
		
		
	}
}


