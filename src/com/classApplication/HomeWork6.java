package com.classApplication;



//Write a guessing game where the user has to guess a secret number between 1 and 20.
//After every guess input, the program tells the user whether their number was too large or 
//too small. The program will keep asking the user to enter the number until he finds the correct
//number. When the correct answer is found the system should display 
//"Congratulations!!. You got it!".


import java.util.Scanner;

public class HomeWork6 {
	public static void main(String[] args) {
		
	

	Scanner scan;
	int guessNumber;
	int secretNumber= 11;

	scan = new Scanner(System.in);
	
	for (int a =0; a <=20; a++);
	
	System.out.println("Enter the guess number");
	guessNumber=scan.nextInt();
	
	if (guessNumber>secretNumber) {
		System.out.println(guessNumber+" is too large.");


	}else if (guessNumber<secretNumber) {
		System.out.println(guessNumber+" is too small. ");

	
		
		
	}

	System.out.println("Plese try again");
	}
}
