package com.class4;

import java.util.Scanner;

public class ScannerClass3WithIfConditions {
	
	// take 2 numbers from a user and compare those numbers
	
	public static void main(String[] args) {
		
		int num1; int num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1=scan.nextInt();
		System.out.println("Please enter the second number");
		num2=scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			
		}else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
			
		} else {
			System.out.println(num1+" is equal to "+num2);
			
		}
		
		
		
	}

}
