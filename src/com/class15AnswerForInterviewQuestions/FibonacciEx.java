package com.class15AnswerForInterviewQuestions;

public class FibonacciEx {
	public static void main(String[] args) {

	//Write a program to print first 10 numbers of Fibonacci series.
		
		int prevNum=1;
		int nextNum=0;
		int sum=0;
		
		for(int i=0; i<10; i++) {
			
			sum=prevNum+nextNum;
			prevNum=nextNum;
			nextNum=sum;
			System.out.print(prevNum+" ");
		}
		
		
		
		
	}
}
//0 1 1 2 3 5 8 13 21 34
//int a=1;
//int b=0;
//int c=0;
//
//for(int i=0; i<10; i++) {
//    c=a+b;
//    a=b;
//    b=c;
//    System.out.print(a+" ");