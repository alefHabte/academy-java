package com.bptn.course._16_java_collection_set;

import java.util.TreeSet;

public class TreeSetManupilation {
	public static void main(String[] args) {
		// Create a TreeSet and populate it with the elements A, B, and C
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");

		// Print the size of the set
		System.out.println("Set size: " + treeSet.size());

		// Print the elements in the set
		System.out.println("Elements in set: " + treeSet);

		// Use the first() method to get the first element and print it
		System.out.println("First element: " + treeSet.first());

		// Use the last() method to get the last element and print it
		System.out.println("Last element: " + treeSet.last());

		// Use the headSet() method to get elements less than 'B' and print them
		System.out.println("Elements less than 'B': " + treeSet.headSet("B"));

		// Use the tailSet() method to get elements greater than or equal to 'B' and
		// print them
		System.out.println("Elements greater than or equal to 'B': " + treeSet.tailSet("B"));

		// Use the subSet() method to get elements between 'A' (inclusive) and 'C'
		// (exclusive)
		System.out.println("Elements between 'A'(inclusive) and 'C'(exclusive): " + treeSet.subSet("A", "C"));

		// Use contains() method to check if the set contains 'B'
		System.out.println("Does the set contain 'B'? " + treeSet.contains("B"));

		// Remove 'B' from the set
		treeSet.remove("B");

		// Print the set to show that 'B' has been removed
		System.out.println("Set after removing 'B': " + treeSet);
	}
}
