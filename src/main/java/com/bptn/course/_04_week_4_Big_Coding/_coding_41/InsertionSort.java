package com.bptn.course._04_week_4_Big_Coding._coding_41;

public class InsertionSort {
	// This method sorts an array in ascending order using insertion sort algorithm
	public static void insertionSort(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
        if (arr==null || arr.length<1) {
            // Return if the array is null or has less than 1 element
            return;
        }
        // Loop through the array starting from index 1 to length of the array
        for (int i=1;i<arr.length;i++) {
            // Store the current element
        	int current =arr[i];
            // Initialize j with i - 1
			int j = i - 1;
            // Inner loop to compare current element with elements before it in the array
			while (j >= 0 && current < arr[j]) {
                // Shift the element to the right
				arr[j + 1] = arr[j];
                // Decrement j to compare with next element
				j--;
               
            }
            // Insert the current element at its correct position
			arr[j + 1] = current;
        }
    }

	// Do not modify below code
	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
//In this program we implemented the insertion sort algorithm to sort the array the array
//the algorithm works by iterating through the array progressively then build a sorted portion by inserting each element into it's correct position
//the algorithm will compare the current element with previous elements and then shift the larger one to the right
//The key take-away was understanding how the insertion sort works step by step, seeing this reassured its simplicity for using it for small datasets but it's still less efficient for larger datasets compared to other sorting algorithms
