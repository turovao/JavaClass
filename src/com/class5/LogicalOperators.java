package com.class5;

public class LogicalOperators {
	public static void main(String[] args) {
		//if number is between 1-10--> number is small
		//if number is between 11-100--> number is medium
		//if number is between 101-1000 --> number is large
		
		int num=1000;
//		   false AND false =FALSE
		if(num>=1 && num <=10) {
		System.out.println("number is small");	
//		  true AND   true =TRUE
		}else if(num>=11 &&  num<=100) {
			System.out.println("number is medium");
//			false AND  true = TRUE
		}else if(num>=101 && num<=1000) {
			System.out.println("number is large");
			
		}
		
	}
	

}
