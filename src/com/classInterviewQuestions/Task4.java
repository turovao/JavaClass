package com.classInterviewQuestions;

public class Task4 {
	public static void main(String[] args) {
		
		// * Maximum and minimum number in the array?
		
	int[] array = { 1, 2, 3, 4, 5, 6, -5, 8, 9, 10, 11, 123, 443};
	
	int max = array[0], min = array[0];
	
	for (int i = 0; i < array.length; i++) {
	if (array[i] < min) {
	min = array[i];
	}
	if (array[i] > max) {
	max = array[i];
	}
	}
	System.out.println("The Maximum is " + max + " The Minimum is: " + min);
	}}


