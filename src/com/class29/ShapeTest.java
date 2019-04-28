package com.class29;

public class ShapeTest {
	public static void main(String[] args) {

		Shape obj1 = new Circle();
		obj1.calculateArea(20);
		obj1.calculatePerimiter(10);
System.out.println("__________________________________");

	Shape obj2 = new Square();
    obj2.calculateArea(10);
    obj2.calculatePerimiter(20);
}
}