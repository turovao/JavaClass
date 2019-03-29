package com.review1;

import java.util.Scanner;

//Write  a program that take user first name and Surname  and  print out  his /her  
//first name and then Surname.
//First Condition: "Please Enter First Name" should print first with input
//Second Condition:"Please Enter Surname" should print second with input

//Final Output: First Name+ Surname on one line on output. Make sure there is 
//a space between First Name and Surname.

public class HomeWorkScanner1 {
	
	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String name=input.nextLine();
		System.out.println("Please Enter Surname");
		String sername=input.nextLine();
		System.out.println(name+" "+ sername);
		
		
		
		
		
	}
	
	
	
	
	



}
