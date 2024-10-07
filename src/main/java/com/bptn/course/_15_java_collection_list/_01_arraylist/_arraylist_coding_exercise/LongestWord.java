package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercise;

import java.util.ArrayList;
public class LongestWord {

	public static String findLongest(ArrayList<String> list) {
		// code here
		String longest = "";
		for (String str : list) {
			// If the current string is longer than the current longest, update the longest
			if (str.length() > longest.length()) {
				longest = str;
			}
		}

		// Return the longest string found
		return longest;
	}

	// Do not modify below code
	public static void main(String[] args) {
		// instantiate ArrayList
		ArrayList<String> values = new ArrayList<String>();
		String[] words = { "singapore", "cattle", "metropolitan", "turnstile" };
		for (int i = 0; i < words.length; i++) {
			values.add(words[i]);
		}
		System.out.println("Expected Result: metropolitan");
		System.out.print("Your Result: ");
		System.out.println(findLongest(values));
	}

}
