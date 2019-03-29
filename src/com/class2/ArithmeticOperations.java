package com.class2;

public class ArithmeticOperations {

	public static void main(String[] args) {

		// Declare 2 int variables and then we perform
		// Addition, subtraction, multiplication, division

		// 1 way
		int a = 30;
		int b = 15;

		System.out.println(a + b); // 45
		System.out.println(a - b); // 15
		System.out.println(a * b); // 450
		System.out.println(a / b); // 2

		// 2 way more prefer

		int sum = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a - b;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

		// Print: the ____ of 2 numbers is __
		
		System.out.println("the sum of 2 numbers is "+sum);
		System.out.println("the sub of 2 numbers is "+sub);
		System.out.println("the mult of 2 numbers is "+mult);
		System.out.println("the div of the 2 numbers is "+div);
		
	}

}
