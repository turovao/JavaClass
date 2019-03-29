package com.class7;

// Create a boolean variable workDay and assign true
//create int variable day and assighn it to 1
//as long as it is workDay print->" I need a day off" and increment
//day once day is 6-> your condition for your loop should become false


public class Task2 {
	
	public static void main(String[] args) {
		 boolean workDay=true;
		 int day=1;
				 
		while (workDay) {
			System.out.println(" I need a day off");
			
			if(day==6) {
				System.out.println("I do not need a day of");
				workDay=false;
			}
			day++;
		}
	}

}
