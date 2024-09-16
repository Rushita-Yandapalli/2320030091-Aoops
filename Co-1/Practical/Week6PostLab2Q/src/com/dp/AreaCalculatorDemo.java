package com.dp;

public class AreaCalculatorDemo {
	public static void main(String args[]) {
		Shape rectangle = new Rectangle(10, 5);
		System.out.println("Area of Rectangle:" + rectangle.calculateArea());
		Shape circle = new Circle(7);
		System.out.println("Area of Circle:" + circle.calculateArea());
	}

}
