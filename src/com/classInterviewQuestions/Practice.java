package com.classInterviewQuestions;

public class Practice {
	public static void main(String []args) {
		
		//Write a java program to find the second largest number in the array? 
		
		int []num= {3,7,11,55,45,78,99,105};
		int largest=0;
		int secondLargest=0;
		int max=0;
		int min=0;
		 for ( int i=0; i<num.length; i++) {
			 if(num[i]>largest) {
				 secondLargest=largest;
				 largest=num[i];
			 }
			 if( num[i]<largest && num[i]>secondLargest) {
				 secondLargest=num[i];
			 }
			 
			 for( int a=0; a<num.length; a++) {
				 if(num[i]>max) {
					 max=num[i];
					 }
				 for( int b=0; b<num.length; b++) {
					 if(num[i]<min) {
						 min=num[i];
					 }
				 }
				 }
			 }
			 
		 System.out.println("The second largest number is "+secondLargest);
		 System.out.println("THe min number is"+ min);
		 System.out.println("The max number is"+ max);
		 
		 
	}

}
