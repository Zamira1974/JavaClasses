package com.InterviewCognizant;

import java.util.Arrays;

/* An array A has N number of integers. The array undergoes the following reduction operation until it has only one value left.
Two indexes i and j are chosen optimally.
The operation A[i]=A[j]-A[i] is performed and A[j] is removed from the array.
The operation is repeated until only one value remains in the array.
Write a program to perform the reduction operation on a given array such that the final value that remains is the maximum.

Note:
The indexes i and j cannot be equal.
 * */
public class FindFinalElemInArray {

	static int arr[] = { 25, 43, 5, 11, 32, 721, 555, 0 };

	static int largest() {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int N = arr.length;

		for (int i = 1; i < N; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest namber is an array is " + largest());

	}
}