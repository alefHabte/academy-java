package com.bptn.course._09_abstraction;

public class Add {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add();
		System.out.println(obj.add(12, 21));
		System.out.println(obj.add(11, 23, 10));
		System.out.println(obj.add(100.10, 200.5));

	}

}
