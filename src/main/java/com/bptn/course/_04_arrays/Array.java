package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		int [] myArray = {3,5,7,9,11,13};
		System.out.println("First element "+myArray[0]);
		System.out.println("First element "+myArray[1]);
		myArray[0]=30;
		System.out.println("Updated First element "+myArray[0]);
		myArray[myArray.length-1]=130;
		System.out.println("Updated last element: "+ myArray[myArray.length-1]);
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}

	}
}
