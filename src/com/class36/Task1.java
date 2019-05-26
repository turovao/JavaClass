package com.class36;
// create an exception: when user it trying to withdraw larger amount that the balance
//throw an exception saying “You do not have enough money”

public class Task1 {
	public static void main(String[] args) {
		
		accountBalance(30);
		
		
		
	}
	public static void accountBalance (int balance) {
		if(balance>40) {
			System.out.println("Plese take your money");
			
		}else {
			throw new ArithmeticException("Your balance is low");
		}
	}
	
	}


