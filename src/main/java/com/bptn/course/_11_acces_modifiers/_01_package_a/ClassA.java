package com.bptn.course._11_acces_modifiers._01_package_a;

public class ClassA {

	private int privateVar;
	public int publicVar;
	int defaultVar;
	protected int protectedVar;

	private void privateMethod() {
		System.out.println("This is a private method");

	}

	private void publicMethod() {
		System.out.println("This is a public method");

	}

	private void protectedthod() {
		System.out.println("This is a protected method");

	}

	void defaulteMethod() {
		System.out.println("This is a default method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA myObj = new ClassA();

		myObj.privateMethod();
		System.out.println("Accessing privat variable: " + myObj.privateVar);

		myObj.defaulteMethod();
		System.out.println("Accessing privat variable: " + myObj.defaultVar);

	}

}
