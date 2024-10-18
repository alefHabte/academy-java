package com.bptn.course._20_Sorting;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteDuplicates {

	/*
	 * This method deletes duplicates from an unsorted ArrayList.
	 * @param nums the sorted ArrayList with duplicates
	 * @return a sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {

		// Check if the list is null or empty, and return an empty list if so
		if (nums == null || nums.size() == 0) {
			// This will returned an empty array list if the elements of the parameter nums
			// is either zero or null,
			
			return new ArrayList<>();

		}

        // Implement the bigger details of your algorithm here...
		// I created a linked hash set and passed the values of num, this is an optimal
		// data structure that removes any duplicate elements and only outputs unique
		// elements
		LinkedHashSet<Integer> noDupSet= new LinkedHashSet<Integer>(nums);
		// I then converted the LinkedHashSet into an array list by passing it into my
		// new ArrayList
		List<Integer> noDupList = new ArrayList<>(noDupSet);
		

		// return sortedAndUnique arraylist
		return noDupList;
	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}

