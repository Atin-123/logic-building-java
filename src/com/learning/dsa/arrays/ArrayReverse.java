package com.learning.dsa.arrays;

/*
 * Problem 4: Reverse Entire array.
 */

public class ArrayReverse {
	
	//My Approach - O(n)
	public static int[] arrayReverse(int[] arr) {
		int i = 0;
		int j= arr.length -1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++; j--;
		}
		return arr;
	}
	
	public static void printElementsOfArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,4,5};
		int[] arr = {10};
		
		int[] res = arrayReverse(arr);
		
		printElementsOfArray(res);
	}

}
