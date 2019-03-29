package com.class3;

public class RelationalOperation1 {
	public static void main(String [] args) {
		
		// declare price and if price is higher than expected price-> i will not buy
		
		double shoesPrice=32.99;
		double allowedPrice=31.99;
		
		if(shoesPrice<=allowedPrice) {
			System.out.println("I am buying the shoes");
			
		} else {
			System.out.println("I am not buying the shoes");
			
			//what ever type after if condition will execute  by itself 
			
			// Example
			System.out.println("I am continues code");
			System.out.println("I am continues code");
			System.out.println("I am continues code");
		}
	}
		

}
