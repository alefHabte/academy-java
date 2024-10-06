package com.bptn.course._08_Polymorphisim;

public class Polymorphism3 {

	void print(int integer) {
		System.out.println("Printing an integer:" + integer);

	}

	void print(String s) {
		System.out.println("Print a string: " + s);
	}

	int print(int a, int b) {
		return a + b;
	}

	double print(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// Takeaway
//Polymorphisim
// no instance req
//method name should be the same
//can have different type of parameters
//static methods can be overloaded