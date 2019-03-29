package com.class4;

import java.util.Scanner;

public class CityAndTemperature {


	// ask user to enter city and temperature in Fahrenheit 
	// Your program should convert f-->c
	//your program should say"The temperature in the city____ is ___"
	
	public static void main(String[] args) {
		
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myScanner.nextLine();

		System.out.println("Please enter temeperature in FahrenhaitL"+cityName);
		temp=myScanner.nextInt();
		
		// formula (F-32) * 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temeperature in the city"+cityName+" is "+convertedTemp+" Celsius");
		
		
		
		
		
		// SCANNER -take the imput from the user
		
	}
	

}
