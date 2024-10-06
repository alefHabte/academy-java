package com.bptn.course._09_abstraction._coding25;

public class Car extends Vehicle {
	private String steeringWheel;

	public Car(String color, String brand, String steeringWheel) {

		super(color, brand);
		this.steeringWheel = steeringWheel;

	}

	public void print() {
		super.print();
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
