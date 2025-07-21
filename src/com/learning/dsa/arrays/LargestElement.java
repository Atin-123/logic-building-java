package com.learning.dsa.arrays;

public class LargestElement {
	
	public static int maxElementInArray(int[] arr) {
		int maxEleIndx = -1;
		int maxEle = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxEle) {
				maxEle = arr[i];
				maxEleIndx = i;
			}
		}
		return maxEleIndx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,7,5,9,6,5};
		
		System.out.println(maxElementInArray(arr));

	}

}
