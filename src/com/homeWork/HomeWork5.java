package com.homeWork;

import java.util.Scanner;

//Prompt user to: "Please enter your birthday month number"
//if user enters 12, 1, 2 --> season="Winter"
//if user enters 3, 4, 5--> season="Spring"
//if user enters 6, 7, 8 --> season="Summer"
//if user enters 9, 10, 11--> season="Fall"
//if any other number--> "Please enter valid month number" and season="Unknown"

//
//The output of the program should be : "You were born in __ "



public class HomeWork5 {
	public static void main(String[] args) {
		
		String season="Unknown";
		 int bMonth;
		 
		 Scanner input=new Scanner(System.in);
		 System.out.println("Plese enter your birthday month number");
		 bMonth=input.nextInt();
		 
		 if(bMonth==12 || bMonth==1 || bMonth==2) {
			 season="Winter";
		 }else if(bMonth==3 || bMonth==3 || bMonth==5) {
			 season="Spring";
		 }else if(bMonth==6 || bMonth==7 || bMonth==8) {
			 season="Summer";
		 }else if(bMonth==9 || bMonth==10 || bMonth==11) {
			 season="Fall";
		 }else {
			 
			 
			 System.out.println("Please enter valid month number");
		 }
		 
		 System.out.println("You were born in "+season);
		 
		 
		 
		 
		 
		 
		
		
	}
	
	

}
