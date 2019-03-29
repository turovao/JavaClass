package com.class5;

import java.util.Scanner;

public class NestedIfConditionsDays {
	public static void main(String[] args) {
		
		String day;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("what is today's day");
		
	      day=input.nextLine();

		
		if (day=="Monday" ||  day=="Tuesday") {
			
			System.out.println("it is a week day");
			
		      }else if  (day=="Saturday" || day=="Sunday") {
		    	  
		    	  System.out.println("it is the weekend");
       }else {
		    	  
		      }
			System.out.println("Invalid");
		      	
		
		
	}
}

	
		

