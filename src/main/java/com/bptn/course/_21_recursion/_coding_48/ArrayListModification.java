package com.bptn.course._21_recursion._coding_48;

import java.util.ArrayList;

public class ArrayListModification {
	public static void main(String[] args) {
        // Create an ArrayList
		
		ArrayList<String> languages = new ArrayList<>();

        // Add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        
        
        System.out.println("Original ArrayList:"+languages);
        // Print the original ArrayList using forEach and a lambda
        for(String element : languages){
			System.out.println(element);
        };

        // Modify all elements to uppercase using replaceAll()
		languages.replaceAll(language -> language.toUpperCase());
      

        
        System.out.println("\nUpdated ArrayList:");
         // Print the updated ArrayList using forEach and a lambda
			languages.forEach(language -> System.out.println(language));
    }
}
