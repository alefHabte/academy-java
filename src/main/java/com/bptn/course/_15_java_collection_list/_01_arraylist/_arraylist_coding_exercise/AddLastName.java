package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercise;

import java.util.ArrayList;

public class AddLastName {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Diego");
		nameList.add("Grace");
		nameList.add("Deja");
		System.out.println(nameList);

		// add code here
		String lastElement = nameList.get(nameList.size() - 1);
		System.out.println(lastElement);
		nameList.set(0, "Alef");
		System.out.println(nameList);

	}

}
