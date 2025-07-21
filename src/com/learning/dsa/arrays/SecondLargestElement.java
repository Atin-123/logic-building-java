package com.learning.dsa.arrays;

/*
 * problem: finding second largest element in the array:
 * 
 */

public class SecondLargestElement {
	
	public static int secondLargest(int[] arr) {
		int largest = 0; 
		int secondLargest = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[largest]) {
				secondLargest = largest;
				largest = i;
			}
			else if(secondLargest == -1 || arr[i] > arr[secondLargest]) {
				secondLargest = i;
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,7,3,4,5};
		
		System.out.println(secondLargest(arr));

	}

}
