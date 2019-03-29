package com.review1;

import java.util.Scanner;

//Create a program that will take a  boolean value from a user make the variable 
//isTrue. if the input is TRUE or FALSE then output should read.

//First Output: "Input the boolean value"
//Final Output: "The value is ______" 

public class HomeWorkBoolean {
	public static void main(String[] args) {
		
		boolean isTrue;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input the boolean value");
		isTrue=input.nextBoolean();
		System.out.println("The value is"+isTrue);
		
		
		
	}

}
