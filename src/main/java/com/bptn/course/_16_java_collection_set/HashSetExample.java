package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of HashSet
		Set<String> hashSet = new HashSet<>();

		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");// It allows duplicates?
		hashSet.add(null);// It allows null values? Yes

		System.out.println("The HashSet of fruits: " + hashSet);

	}

}
//Major key takeaways;
//1, Insertion Order- Yes
//2, It allows null values? yes
//3, It allows duplicates? No
//4, Underlying implementationj- HashTable and Doubly LinkedList
//5, Is a LinkedHashSet indexed?- No
