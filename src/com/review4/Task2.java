package com.review4;


//Write a program that the String "the time is 07:min
//and then all the mins till 7:30
// with if conditions
public class Task2 {
	
	public static void main(String [] args) {
		
		

		int mintz=0;
		
		while(mintz<=30) {
			if (mintz<10) {
			System.out.println("The time is 07:0"+mintz);
			
			}else {
				System.out.println("The time is 07:"+mintz);	
				
			}
			mintz++;
		}
		
		for(int mint=0; mint<31; mint++) {
			
			
			if (mint<0) {
				
			System.out.println("The time is 07:0"+mint);
			
			
		}else {
			
			System.out.println("The time is 07:"+mint);
			
		}	
		
		
	}
		
		int mintus=00;

			do {
				if (mintus<10) {
					
				System.out.println("the time is 07:0"+mintus);
				
			}else {
				
				System.out.println("the time is 07:"+mintus);
			}
				mintus++;

		}while (mintus<31); 
		

	}	
	}
		