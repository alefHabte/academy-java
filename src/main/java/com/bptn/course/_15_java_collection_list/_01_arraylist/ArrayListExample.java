package com.bptn.course._15_java_collection_list._01_arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);

		System.out.println(arrayList);
		System.out.println("The size of arraylist" + arrayList.size());

		arrayList.add(1, 3);

	}

}
