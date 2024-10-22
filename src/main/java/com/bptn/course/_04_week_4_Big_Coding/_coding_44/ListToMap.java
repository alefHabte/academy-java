package com.bptn.course._04_week_4_Big_Coding._coding_44;

//Import all necessary packages here
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	// create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
		return students.stream().collect(Collectors.toMap(Student::getId, student -> student));
	}
	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		List<Student> students = new ArrayList<>();

		// add student objects to this list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));
		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		Map<Integer, Student> studentMap = convertStudentListToMap(students);

		// Print the map
		System.out.println("Students Map: " + studentMap);
	}
}

//Our goal was to transform a list of Student objects into a map where the student ID will be the key
//and the student object as the value. we achieved this by using java strams and the collectors.toMap method
//In this task we looked at ways to manipulate collections using streams and method references, which will make our code more efficient and readable.
//what we can take away is that we can use streams fro transforming and collecting data concisely 