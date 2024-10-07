package com.bptn.course._15_java_collection_list._01_arraylist._coding_31;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println("ArrayList Elements:");
		
		for (int element : arrayList) {
			System.out.println(element);
		
		}
		arrayList.set(2, 35);
		arrayList.remove(1);
		System.out.println("Size of ArrayList: " + arrayList.size());

	}

}
