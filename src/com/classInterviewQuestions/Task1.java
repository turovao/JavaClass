package com.classInterviewQuestions;


//1. Write a program to swap 2 numbers without a temporary variable? 
		//Swap  2 strings without a temporary variable?

public class Task1 {
	public static void main(String[] args) {
		
		 int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x  "+x);
	        System.out.println("y  "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x  "+x);
	        System.out.println("y  "+y);
	    
	
	
	  String a="Raafat";
      String b="Olga";
      
      
      a = a + b;
      b = a.replace(b, "");
      a = a.replace(b, "");
  
      System.out.println(a);
      System.out.println(b);

	
	

	
}
	
}
		
	
	


