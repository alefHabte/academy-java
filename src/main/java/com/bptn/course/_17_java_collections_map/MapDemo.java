package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I created a HashMap object called numbers
		Map<Integer, String> numbers = new HashMap<>();
		// I added key-value pairs to the Map
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		// Printing out the map
		for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// Use remove() to remove the value with key 7
		numbers.remove(7);

		// Added a key-value pair for 11
		numbers.put(11, "eleven");

		// Print the updated map

		for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
