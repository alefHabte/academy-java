package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercise;

public class Student {
	private String name;
	private String email;
	private int id;

		// TODO Auto-generated method stub


		   public Student(String initName, String initEmail, int initId) {
		      name = initName;
		      email = initEmail;
		      id = initId;
		   }

		   // toString() method
		   public String toString() {
		     return id + ": " + name + ", " + email;
		   }

	}


