package com.class4;

public class Mortgage {
	
	//1)Create a Java program and store variables to store mortgage rate and mortgage 
	//price.
	//2) First program should check if rate is higher than 4.5 user will not buy a 
	// house, otherwise user will consider buying.
	//3)Once user decides to buy a house, if price of the house is larger than 200,000
	// than user will take a loan, otherwise user will pay cash.
	
	public static void main(String [] args) {
		
	 double mortgageRate=4.5;
	 
	 int mortgagePrice=200000;
	 
	 if(mortgageRate>4.5) {
		 
		 System.out.println("I am not buying the house");
	 } else {
		 System.out.println("I will consider buying a house");
		 
		 if(mortgagePrice>=200000) {
			 System.out.println("I will take a loan");
		 } else {
			 System.out.println(" I will pay cash");
		 }
		 
	 }
	 
			 
	}
		

  
	
}
