package com.class19;

import java.util.Scanner;

//lets create a class called Calculator
//Have method that takes 3 inputs and return the result and return the sum, average, min, max

public class Calculator {
	
	
	
	
	
		public static int sum(int a, int b, int c) {
			int sum=a+b+c;
			return sum;
			
		}
		public static int avg(int a, int b, int c) {
			int avg=(a+b+c)/3;
			return avg;
		}
		public static int max(int a, int b, int c) {
			int max=0;
			if(a>b && a>c) {
			   max=a;
				
			}else if(b>a && b>c) {
			   max=b;
			}else {
				max=c;
			}return max;
			
		}
		public static int min(int a, int b, int c) {
			int min=0;
			if(a<b && a<c) {
			   min=a;
				
			}else if(b<a && b<c) {
			   min=b;
			}else {
				min=c;
			}return min;
			
		}





	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			System.out.println(Calculator.sum(a,b,c));
			System.out.println(Calculator.min(a,b,c));
			System.out.println(Calculator.avg(a,b,c));
	        System.out.println(Calculator.max(a,b,c));
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}