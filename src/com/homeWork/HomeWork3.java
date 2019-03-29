package com.homeWork;

import java.util.Scanner;

public class HomeWork3 {

//{Prompt user to input two strings : "Please enter two strings"
//	and two integers: "Please enter two numbers"  
	//	and make the comparisons:
	//	if int1 and int2 are equal and word1 and word2 are equal, output "AND"
	//	if int1 and int2 are equal or word1 and word2 are equal, output "OR"
	//	if int1 and int2 are not equal and word1 and word2 are not equal, output
//"NONE"
//Example input/output:
//word1: banana
  // word2: apple
  // int1: 2
//int2: 2

public static void main(String[] args) {
	
	
		
		String s1,s2;
		
		int num1,num2;
		

		
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please enter two strings");
	 s1=scan.nextLine();
	 s2=scan.nextLine();
	 
	 System.out.println("Plese enter two numbers");
	 num1=scan.nextInt();
	 num2=scan.nextInt();
	 
	 
	 
	   if( num1==num2 && s1.equals(s2)) {
		   System.out.println("AND");
		      
	   }else if( num1==num2 || s1.equals(s2))  {
		    System.out.println("OR");
	   }else if( num1!=num2 && !s1.equals(s2)) {
		 System.out.println("NONE");
	   }
	 System.out.println("result");
	 
		}
	}


	
