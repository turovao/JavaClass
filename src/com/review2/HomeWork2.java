package com.review2;

import java.util.Scanner;

//Create a program that prompt user with question:  Do you need a loan?
//If the result is true then prompt user with question: What is your credit score? 
//Otherwise eligibility = "Unknown"
//Based on the score define users eligibility 
//if score is below  600 --> eligibility = "Not eligible"
//if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//if score is higher than any other previous values --> eligibility = "Definitely 
//eligible" .   

//The output of the program should be: "The eligibility is ____"

public class HomeWork2 {
	public static void main(String[] args) {
		
		boolean loan;
		int score;
		String result;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		loan=scan.nextBoolean();
		
		
		if(loan) {
			System.out.println("What is your credit score");
			score=scan.nextInt();
			result=scan.nextLine();
			if(score<600) {
				result="Not eligible";
			}else if(score>=600 && score<700) {
				result="Maybe eligible";
			}else if(score>701 && score <800) {
				result="Eligible";
			}else if(score>800) {
				result="Definitely eligible";
			}
			
		}else {
			result="Unknown";
		}
		System.out.println("The eligibility is "+result);
	}

}
