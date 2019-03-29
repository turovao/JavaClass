package com.review1;

import java.util.Scanner;

public class HomeWork3 { 
	public static void main(String[] args) {

		int x;
		int y;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		x = input.nextInt();
		System.out.println("Please enter second number");
		y = input.nextInt();

		if (x * y == 0) {
			System.out.println("ZERO");

		} else if (x * y > 0) {

			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
