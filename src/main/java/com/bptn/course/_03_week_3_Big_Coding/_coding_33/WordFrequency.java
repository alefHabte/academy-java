package com.bptn.course._03_week_3_Big_Coding._coding_33;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
	        String sentence = "This is a test sentence with no repeating words";

	        // Split the sentence into words using split() method
	        String[] words=sentence.split(" ");
	        

	        // Create a Map to store the frequency of each word
	        Map<String, Integer> wordFrequency = new HashMap<>();

	        // Iterate through each word in the sentence
			for (String word : words) {
	            // If the word is already in the map, increment its frequency 
				if (wordFrequency.containsKey(word)) {
					Integer frequency = +wordFrequency.get(word);
					frequency = +1;
					wordFrequency.put(word, frequency);
	            }
	            // If the word is not in the map, add it with a frequency of 1
	            else {
					wordFrequency.put(word, 1);
	            }
	        }

	        // Print the frequency of each word
	        System.out.println("Word frequency: " + wordFrequency);
	    }
}
