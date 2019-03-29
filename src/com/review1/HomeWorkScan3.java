package com.review1;

import java.util.Scanner;

//Write a program to take user name, age and mobile number in single line.

//First Output: "Enter your name"
//Second Output: "Enter your mobile number"
//Third Output: "Enter your age"
//Final Output: "Your name is ___ , your age is ___ and your mobile number 
//is (___)-___-____"


//Note: this final output is an example must use a variable for Weqas for name,
//70 as a variable, and mobile number as a Variable when you use scanner must be 
//able to input these values



public class HomeWorkScan3 {
	public static void main(String[] args) {
		
		String name;
		String mobileNumber;
		String age;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		name=input.nextLine();
		System.out.println("Enter your mobile number");
		mobileNumber=input.nextLine();
		System.out.println("Enetr your age");
		age=input.nextLine();
		System.out.println("Your name is "+name+", " +"your age is "+age+ " and your mobile number is "+mobileNumber);
		
		
	}

}
