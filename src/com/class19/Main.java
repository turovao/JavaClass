package com.class19;



public class Main {
	public static void main(String [] args) {
		 int prevNum=1;
		 int nextNum=0;
		 int sum=0;
		 
		 for(int i=0; i<10; i++) {
			 sum=prevNum+nextNum;
			 prevNum=nextNum;
			 nextNum=sum;
			 
			 System.out.println(prevNum+" ");
			 
		 }
				           

		}
			
	}
		
	
		
		
		
		
		
		
	