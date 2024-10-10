package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of HashSet
		Set<String> treeSet = new TreeSet<>();

		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("cherry");// It allows duplicates?
		treeSet.add(null);// It allows null values? Yes

		System.out.println("The HashSet of fruits: " + treeSet);

	}

	}
// Major key takeaways;
// 1, Insertion Order- Natural ascending order
// 2, It allows null values? no null value- it throws NullPointerException
// 3, It allows duplicates? No
// 4, Underlying implementation- HashTable and Doubly LinkedList
// 5, Is a LinkedHashSet indexed?- No


