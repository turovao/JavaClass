package com.class17_2;

import java.util.Scanner;

//Write a program that reads a range of integers (start and end point), provided by a user and 
//then from that range prints the sum of the even and odd integers.

public class Practice1 {
	public static void main(String[] args) {
		
		
		Scanner scan;
		int startRange, endRange;
		int sum=0;
		int sum1=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter start number");
		
		startRange=scan.nextInt();
		System.out.println("Plese enter a end number ");
		endRange=scan.nextInt();
		
		

		for( int a= startRange;  a<=endRange; a++) {
			if( a%2==0) {
				sum=sum+a;
				
		}else {
			sum1=sum1+a;
		}
	}
    System.out.println( "The sum of even numbers equal to "+sum);
    
    System.out.println( "The sum of odd numbers equal to "+sum1);
	}
}