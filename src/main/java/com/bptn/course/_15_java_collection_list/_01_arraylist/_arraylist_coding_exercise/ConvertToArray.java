package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercise;

import java.util.ArrayList;

public class ConvertToArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rewrite this code to use an ArrayList instead of an array
		ArrayList<String> toDoList = new ArrayList<>();
		toDoList.add("Do homework");
		toDoList.add("Help make dinner");
		toDoList.add("Call grandma");
		// changing element at index 1
		toDoList.set(1, "Order pizza");
		System.out.println(toDoList.size() + " things to do!");
		System.out.println("Here's the first thing to do: " + toDoList.get(0));
		// remove item 0 and move everything down
		// (this can be done in 1 command with ArrayList)
		toDoList.remove(0);
		System.out.println("Here's the next thing to do: " + toDoList.get(0));

	}

}
