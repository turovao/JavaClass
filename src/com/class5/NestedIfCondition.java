package com.class5;

public class NestedIfCondition {
	public static void main(String[] args) {

		// check if user has credit card-->
		// check what is the balance , if the balance is more than 1000-->
		// pay off
		// else --> you are good.

		boolean creditCard = true;
		int balance = 1000;

		if (creditCard) {
			System.out.println("Check the balance");
			if (balance >= 1000) {
				System.out.println("Pay it off now");
			} else {
				System.out.println("You are safe");
			}

		} else {
			System.out.println("You dont have to check the balance");
		}

	}
}
