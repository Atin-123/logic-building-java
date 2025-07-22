package com.learning.dsa.arrays;

/*
 * Problem 6: Move zero to the end of the array but order of non zero element should reamin same
 * I/P: [10,12,0,0,5,0]
 * O/P: [10,12,5,0,0,0]
 */

/*
 * SOLn: the idea is to keep track of the non zero elements when traversing from left to right
 * the count of non zero element itself is the index of first 0 in the array. 
 * Whenever, we find any non zero in the traversal, we will swap that current pos with count pos. and increase the count.
 * 
 */

public class MoveZerosToEnd {
	
	public static void moveZeros(int[] arr) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] != 0) {
				
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				
				count++;
			}
		}
	}
	
	public static void printElementsOfArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,0,0,5,0};
		
		moveZeros(arr);
		
		printElementsOfArray(arr);

	}

}
