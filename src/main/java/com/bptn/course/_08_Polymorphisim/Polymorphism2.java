package com.bptn.course._08_Polymorphisim;

class Shape {
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

class Rectangle extends Shape {
	@Override
	void drawAngle() {
		System.out.println("Drawing a cicle");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.drawAngle();

	}

}
