package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercise;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Skyler", "skyler@sky.com", 323171));

		// add your code here
		roster.add(new Student("Ayanna", "ayanna@gmail.com", 789012));


		System.out.println(roster);

	}

}
