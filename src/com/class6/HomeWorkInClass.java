package com.class6;

import java.util.Scanner;

public class HomeWorkInClass {
	
	//Ask user to enter their country and capture it. Once values are captured print 
	//which language user speaks.
	
	public static void main(String[] args) {
		

        Scanner scan;
        String country;
        String language;
        
         scan=new Scanner(System.in);
         System.out.println("Please enter wich country you are from");
        country=scan.nextLine();
        
        switch(country) {
        
        case "USA":
        	language="Englsh";
            break;
        
        case"Russia":
        	language="Russian";
            break;
        case"Italy":
        	language="Italian";
            break;
        case"Turkey":
        	language="Turkish";
            break;
        
        case"Frence":
        	language="French";
            break;
        default:
        	language="Unknown";
          // favoriteFood="Unknown";
            
        }
        System.out.println("Your language is " +language);
	    

}   
	}


