package com.learning.dsa.arrays;

/*
 * Problem 5: Remove Duplictes from Sorted array
 * I/P: [10, 20, 20, 30, 30, 30]
 * O/P: [10, 20, 30,_,_,_]  - not going to de-allocate the space, main goal is to keep distinct element in front.
 * size = 3
 */

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicates(int[] arr) {
		int distinctIndx = 1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[distinctIndx - 1]) {
				arr[distinctIndx] = arr[i];
				distinctIndx++;
			}
		}
		return distinctIndx;
	}
	
	public static void printElementsOfArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 20, 30, 30, 30};
//		int[] arr = {10,10,10};
		
		System.out.println(removeDuplicates(arr));
		
		printElementsOfArray(arr);

	}

}
