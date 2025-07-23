package com.learning.dsa.arrays;

/*
 * Problem 9: Leaders in an Array
 * Given an array, if no other elements of the right side of the current element is greater, 
 * then current element is leader
 * 
 * I/P: [30,20,10]
 * O/P: 30 20 10 -> every element is leader compare to it's right side of the array.
 * 
 * I/P: [1,6,3,5,1,2]
 * O/P: 6,5,2 -> right most element is alwways leader as no element is there right side of it.
 */

/*
 * SOLn: we need to start checking from right side, the right most is always leader 
 * so we will assign it as current leader.
 * and then start traversing array from second last element of arry to it's left and check
 * if ith element is greater than the current leader, than that also a leader and current leader
 * will be updated with ith element. 
 */
public class LeadersInArray {
	
	//This solution will take O(n) time and O(n) space.
	//If don't have the requirement to maintain the same sequence as output, the space can be O(1);
	//In that case output will be in reverse order as traversing from right to left.
	public static void leaders(int[] arr) {
		
		int sizeOfArr = arr.length;
		
		int[] resArr = new int[sizeOfArr];
		
		int index = 0;
		
		int currentLeader = arr[sizeOfArr-1];
		
		resArr[index++] = currentLeader;
		
		for(int i=sizeOfArr-2; i>=0; i--) {
			if(arr[i] > currentLeader) {
				resArr[index++] = arr[i];
				currentLeader = arr[i];
			}
		}
		
		for(int i=resArr.length-1; i>=0; i--) {
			if(resArr[i] != 0) {
				System.out.print(resArr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=  {1,6,3,5,1,2};
		int [] arr = {30,20,10};
//		int [] arr = {10};
		leaders(arr);

	}

}
