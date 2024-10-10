package com.bptn.course._17_java_collections_map;

import java.util.HashMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I create a HashMap object
		HashMap<String, Integer> people = new HashMap<>();

		// I added a key-value pair to the map
		people.put("Angie", 25);
		people.put("Steve", 30);
		people.put("John", 32);

		// I used a for loop to print out the key-value pairs
		for (String key : people.keySet()) {
			// I printed out each key-value pair
			System.out.println("Key: " + key + ", Value: " + people.get(key));
		}

	}

}
