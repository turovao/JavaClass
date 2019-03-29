package com.class11;

public class Largest {

	public static void main(String[] args) {

//		int[] number = { 4, 5, 6, 7, 8, 23, 55, 349 };
//		int max = number[0];
//		int min = number[0];
//
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] > min) {
//				max = number[i];
//
//			} else if (number[i] < min) {
//				min = number[i];
//
//			}
//
//		}
//		System.out.println(max + " is the max value ");
//		System.out.println(min + " is the min value");
	//}
		//_____________________________________________________________
		
		
		
		int [] numbers= {200,20,13,499,65};
//		
//		int largest=numbers[0];
//		
//		for( int i=0; i<numbers.length; i++) {
//			
//			if (numbers[i]>largest) {
//				
//				largest=numbers[i];
//			
//			} 
//		}
//				System.out.println("The largest numbers is "+largest);	
//			
//			}

		
	int[] number = { 4, 5, 6, 7, 8, 23, 55, 349 };
	int max = number[0];
	for (int i = 0; i < number.length; i++) {
		if (number[i] > max) {
			max = number[i];
		}
	}
		System.out.println(max + " is the max value ");
}
	
	}

