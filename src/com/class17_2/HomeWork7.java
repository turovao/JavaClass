package com.class17_2;

import java.util.Scanner;

//Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
//As soon as the user enters the correct leap year exit the loop.

public class HomeWork7 {
	
	

	public static void main(String[] args) {

		HomeWork7 leap = new HomeWork7();
		leap.leapYear();

	}
	
	

	void leapYear() {
	   int year = 0;
		
		Scanner scan=new Scanner(System.in);
		
		for (int a=0; a<=10; a++) {
		
		System.out.println("Enter the guess leap year");
		
		year=scan.nextInt();
		
		if (year %4!=0) {
			System.out.println(year+"wrong guess");
		}else if (year %4==0) {
			System.out.println("Congratualtions!!. you got" );
			
			break;
		}
		}	
	   
		
	}

//_______________________________________________________________________________________
//Scanner input = new Scanner(System.in);
//int year;
//for (int a = 1; a <= 5; a++) {
//    System.out.println("Please Enter Year");
//
//    year = input.nextInt();
//
//    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//        System.out.println("Is leap Year");
//
//    } else {
//        System.out.println("Is Not leap Year");
//
//        {
//        }
//    }
//}
//}
//}
//____________________________________________________________________________________________

//Scanner scan;
//int year;
//
//scan=new Scanner(System.in);
//
//for (int i=0; i<10; i++) {
//    
//    System.out.println("Please enter a guessed leap year");
//    year=scan.nextInt();
//    
//    //if year is divisible by 400--> leap year
//    //if year is divisible by 100--> not a leap year
//    //if year is divisible by 4--> a leap year
//    //(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
//    
//    if (year%400==0) {
//        System.out.println("Year is a leap year");
//        break;
//    }else if (year%4==0 && year%100!=0) {
//        System.out.println("Year is a leap year");
//        break;
//    }else {
//        System.out.println("Year is a NOT leap year");
//    }
//    
//}
//}
//}
	
}