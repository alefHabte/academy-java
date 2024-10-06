package com.bptn.course._02_week_2_Big_Coding;

public class Triangle {

	public int perimeterCalculator(int a, int b, int c) {
		int perimeter = a + b + c;
		return perimeter;
	}

	public int areaCalculator(int b, int h) {
		int area = (int) (0.5 * b * h);
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle object = new Triangle();

		int a = 7;
		int b = 10;
		int c = 35;
		int perimeter = object.perimeterCalculator(a, b, c);
		double area = object.areaCalculator(7, 10);
		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

	}

}
