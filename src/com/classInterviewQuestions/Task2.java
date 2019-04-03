package com.classInterviewQuestions;


//2.Write a java program to find the second largest number in the array? 

public class Task2 {
	public static void main(String[] args) {
		
	
	
	int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largest = arr[0];
	int secondLargest = arr[0];
	 
	 
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];
	}
		
		if( arr[i]<largest && arr[i]> secondLargest) {
			secondLargest= arr[i];
		}
	}
	System.out.println("\nSecond largest number is:" + secondLargest);

	}
	}

