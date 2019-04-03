package com.class15AnswerForInterviewQuestions;

public class Practice2 {
	public static void main(String []args) {
		
	
	
	int []arr= {10,20,40,66,55,100};
	
	int min=arr[0];
	int max=arr[0];
	int secondMax=arr[0];
	
	for( int a: arr) {
		if(a<min) {
			min=a;
		}else if(a>max) {
				secondMax=max;
				max=a;
		}else if(a>secondMax) {
			secondMax=a;
		}	
				
			
	
	}
	
	System.out.println("min:"+min);
	System.out.println("max:"+max);
	System.out.println("secondMax"+secondMax);
	
	}
}
