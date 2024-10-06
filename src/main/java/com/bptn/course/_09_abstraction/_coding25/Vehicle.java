package com.bptn.course._09_abstraction._coding25;

public class Vehicle {

	private String color;
	private String brand;

	public Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	public void print() {
		System.out.println(this.color + " " + this.brand);
	}

//	public Vehicle(String color2, String brand2) {
//		// TODO Auto-generated constructor stub
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
