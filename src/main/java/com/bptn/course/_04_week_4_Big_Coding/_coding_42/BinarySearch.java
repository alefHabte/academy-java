package com.bptn.course._04_week_4_Big_Coding._coding_42;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);
		
		// Initialize low and high pointers for the start and end of the array respectively
		int low=0;
		int high=arr.length-1;

		// Keep looping until the high pointer is greater than or equal to the low pointer
		while (high>=low) {
			// Calculate the middle index
			int mid=(low+high)/2;
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				 return mid;
			}
			// If the element at the middle index is less than the key, move the low pointer to the middle + 1
			else if (arr[mid] < key) {
				low = mid + 1;
				low = mid + 1;
			}
			// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
			else {
				high = mid - 1;

			}
		}
		// If the key is not found, return -1
		return -1;
		
	}

	// Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
//In this program we sorted the unsorted array by performing a binary search to find a target value
//we used the Array.sort() method to sort the array making sure it was in the correct order before we implemented the binary search
//we then used a while loop to implement the binary search algorithm to find the target by adjusting the low and high pointers
//the key take away from this program is we can use binary search and sorting together to quickly locate elements in an array, which emphasize the importance of pre-sorting for a binary search
