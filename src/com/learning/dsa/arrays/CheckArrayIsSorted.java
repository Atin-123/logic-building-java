package com.learning.dsa.arrays;

/*
 * Problem 3: Check if the given array is sorted
 */
public class CheckArrayIsSorted {
	
	//My Approach- O(n)
	public static boolean arrayIsSorted(int[] arr) {
		if(arr.length == 1) {
			return true;
		}
		else if( arr.length == 2) {
			if(arr[0] > arr[1]) {
				return false;
			}
		}
		else {
			for(int i=1; i<arr.length-1;i++) {
				if(!(arr[i]>= arr[i-1] && arr[i] <= arr[i+1])) {
					return false;
				}
			}
		}
		return true;
	}
	
	//More precised and correct - O(n)
	public static boolean arrayIsSortedPrecised(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,5,3,5,6,4};
//		int[] arr = {10,10,20,30};
//		int[] arr = {1,2,3,4,5,5};
		int[] arr = {10};
		
		System.out.println(arrayIsSortedPrecised(arr));

	}

}
