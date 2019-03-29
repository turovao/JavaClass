package com.review2;

import java.util.Scanner;

//Prompt user with question: "Is it weekend?"
//if it is not a weekend --> subject="Manual testing"
//Otherwise --> subject="Java"

//Output of the program should be: "Today you will be learning ____"

public class HomeWork1 {
	public static void main(String[] args) {
		
	
		Scanner scan;
		Boolean weekend;
		String activity;		
		
		
		scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		weekend=scan.nextBoolean();
		
		if(!weekend) {
			activity="Manual testing";
		}else {
			activity="Java";
		}
		
		System.out.println("Today you will be learning "+activity);
		
		
		
		
		
		
	}

}
