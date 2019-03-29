package com.class8;

import java.util.Scanner; // cmd+shift+o -> shorcut for import

public class Task1 {
	public static void main(String[] args) {
		// ask user to pay a soda
		//keep asking user to pay for soda untill entered price is not equal to 1.99
		// after user got a right amount print
		// please enjoy your soda
		
		
		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		do {
			System.out.println("Please pay for soda");
			
			price=scan.nextDouble();	
			
		}while(price!=1.99);
		System.out.println("Please enjoy your soda");
		
		
		
		
		
		
		
	}

}
