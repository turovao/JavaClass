package com.class9;

import java.util.Scanner;

//Ask user to enter the item they want to buy and  the price for the item.
///Then ask user to pay for it. 
//Every time user enters money accumulate the amount and tell user how much is left 
//to pay off the amount.
//Whenever user done with payments tell them "Thank you for shopping!"

public class HomeWork2 {
	public static void main(String[] args) {
		
		
double sum=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the item you want to buy");
        String item=scan.nextLine();
        System.out.println("Enter the price for the item");
        double price=scan.nextDouble();
        
        do {
        System.out.println("Now please pay for your item");
        double price1=scan.nextDouble();
            sum=sum+price1;
            System.out.println((price-sum)+" is left to pay off the amount");
        
        }
        while (sum<price);
        System.out.println("Thank you for shopping with us");
    
        
            
        
        }
                

}		
		
	


