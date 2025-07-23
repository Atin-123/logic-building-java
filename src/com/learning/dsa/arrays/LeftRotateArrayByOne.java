package com.learning.dsa.arrays;

/*
 * Problem 7: Left rotate Array by one
 * I/P: [1,2,3]
 * O/P: [2,3,1]
 */

public class LeftRotateArrayByOne {
	
	public static void leftRotateByOne(int[] arr) {
		int temp = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length -1] = temp;
	}
	
	public static void printElementsOfArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
//		int [] arr = {2};
		
		leftRotateByOne(arr);
		
		printElementsOfArray(arr);
	}

}
