package com.homeWork;
//Write a program that use for loop to print multiples of 3 between 1 and 20.
//
//Must not include the number 20 in the output 
//
//Hint :
//3*1=3 
//3*2=6
//3*3=9
//3*4=12
//3*5=15
//3*6=18
//
//Output:
//3
//6
//9
//12
//15
//18


public class IfLoops5 {
	public static void main(String[] args) {
		
		
		for(int a=1; a<20; a++) {
			if(a%3==0) {
			System.out.print(a+" ");	
			}
		}
		
	}

}
