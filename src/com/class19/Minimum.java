package com.class19;
//Create a class Called Minimum
//
//with in it crate a method called minOfValues
//
//make it static
//
//From your previous Applicaion1 class call the method and pass an array argument
//
//and prin out the result
//int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

public class Minimum {
	
	 static int  minOfValues(int[]  x) {
 	 
		int min=0;
		
		for(int  y:x) {
			
			if (y<min) {
				min=y;
			}
		}
		return min;
	 }	




	 static int  maxOfValues(int[]  x) {
	 	 
			int max=0;
			
			for(int  y:x) {
				
				if (y<max) {
					max=y;
				}
			}
			return max;
			
		 }	
   


	
	}
}