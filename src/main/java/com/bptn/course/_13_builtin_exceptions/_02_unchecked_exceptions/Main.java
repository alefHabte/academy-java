package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main {

	public void method1() {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(arr[4]);
	}

	public void method2() {
		try {
			method1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handeled");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.method2();
		// TODO Auto-generated method stub

	}

}
