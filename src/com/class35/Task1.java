package com.class35;
///How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value
//		then programmer expected.

import java.util.InputMismatchException;
import java.util.Scanner;

import com.class16.Main;

public class Task1 {
	public static void main(String[] args) {
		
	
	Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter a number ");

    
    try{
        int num = myScanner.nextInt();
        System.out.println("your numher is " +num);
    }
    catch(InputMismatchException e) {
        System.out.println("Your Number is  wrong");
    }
}
}
