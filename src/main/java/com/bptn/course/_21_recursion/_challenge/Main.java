package com.bptn.course._21_recursion._challenge;

import java.util.Arrays;

class Main {

	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		
		
		// sort array
		mergeSort(arr, 0, arr.length - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int r) {
		// to determine the sizes of the two arrays to be merged
		int a1 = m - l + 1;
		int a2 = r - m;

		// we then store the left and right subarrays in temporary arrays
		int[] L = new int[a1];
		int[] R = new int[a2];

		// To copy the data into the temporary arrays we loop until using length size
		for (int i = 0; i < a1; i++)
			L[i] = arr[l + i];
		for (int j = 0; j < a2; j++)
			R[j] = arr[m + 1 + j];
		// we then set the initial indexes of the left, right and merged subarrays
		int i = 0, j = 0;
		int k = l;
		// we then merge the two subarrrays
		while (i < a1 && j < a2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// we then make sure we copy any remaining elements of the L temp array
		while (i < a1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// we then make sure we copy any remaining elements of the R temp array
		while (j < a2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int l, int r) {
		// Add code here
		if (l < r) {
			// to get middle point
			int m = l + (r - l) / 2;

			// to sort the first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}
}
