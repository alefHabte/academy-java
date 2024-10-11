package com.bptn.course._18_java_threads;

public class ThreadExample implements Runnable {

	public ThreadExample(String name) {

	}

	@Override
	public void run() {
		// Thread logic goes here (currently empty)
		System.out.println(Thread.currentThread().getName() + " is running.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t1 = new ThreadExample("Thread 1");
		ThreadExample t2 = new ThreadExample("Thread 2");



	}


}
