package com.learning.dsa.arrays;

/*
 * Problem 8: Left Rotate array by D places.
 * I/P: [1,2,3,4,5]
 * d = 2
 * 
 * O/P: [3,4,5,1,2]
 */

/*
 * SOLn: the solution which is going to take O(n) time and O(1) space is using the following algorithm.
 * Reverse -> array from 0 to d position elements
 * Reverse -> array from d+1 to remaining all the elements of the array.
 * Reverse -> the whole array.
 * 
 */

public class LeftRotateArrayByD {
	
	public static void reverseArray(int[] arr, int startIndex, int endIndex) {
		int i= startIndex;
		int j = endIndex;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++; j--;
		}
	}
	
	//Approach - O(n) time, O(1) space.
	public static void leftRotateByD(int[] arr, int d) {
		
		reverseArray(arr, 0, d-1);
		
		reverseArray(arr, d, arr.length-1);
		
		reverseArray(arr, 0, arr.length-1);
		
		
	}
	
	public static void printElementsOfArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		
		int d = 2;
		
		leftRotateByD(arr, d);
		
		printElementsOfArray(arr);

	}

}
