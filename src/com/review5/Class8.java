package com.review5;

//* Write a program to sum the values of an array
//10,20,30,40,50,60,70,80

public class Class8 {
	
	
	public static void main(String []args) {
		
		int sum=0;
		
		int []numbers= {10,20,30,40,50,60,70,80, 90,100};
		for(int  i=0; i<numbers.length; i++) {
		
			sum=sum+numbers[i];
		}
		System.out.println(sum);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	