package com.bptn.course._18_java_threads._coding_39;

import java.util.List;

public class MyThread extends Thread {

	// Declare an instance variable of type List<Integer>
	List<Integer> list;
	// Create a parameterized constructor.
	public MyThread(String name, List<Integer> list) {
	        super(name);  // Passing the thread name to the parent Thread class
	        this.list = list;  // Initializing the list instance variable
	    }
	// Override the run() method here.
	@Override
	public void run() {
		// Calling the static method insertNextId() from the ListUtils class
		ListUtils.insertNextId(list);
	}
}