package com.review1;

import java.util.Scanner;

//Write a program that asks the user's age and then display it by adding 10 i.e 
//(age + 10)

//First Output: "Enter your age"
//Final Output: "your age after 10 years is " remember to put the value in your 
//final output with 10 years added to it


public class HomeWorkScan2 {
	public static void main(String[] args) {
		
		int age;
	
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your age");
	    age=input.nextInt();
		
		 int futureage=age+10;
		 System.out.println("your age after 10 years is "+futureage);
		 
		
		
		
		
		
	}

}
