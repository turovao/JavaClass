package com.class5;

import java.util.Scanner;

public class TryAtClassOrAndConditions {
	
	//Prompt the user to enter one people's heights in inches.
	//Each person should be classified as one of the following:
	//• short (under 5 feet)
//	• medium(5 to 6 feet)
//	• tall (6 feet and over)
	
	public static void main(String[] args) {
		
		double height;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first height");
		height=input.nextDouble();
		
		if( height<5) {
			System.out.println("Short");
		}else if(height==5 && height<6) {
			System.out.println("Medium");
		}else if (height>=6){
			System.out.println("Tall");
		}else {
			System.out.println("Please enter valid height");
		}
		
		
		
	}

}
