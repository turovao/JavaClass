package com.class11;




//Create an array of countries: north america countries, south america countries, 
//europe countries, asian countries, african countries. Then print all values from 
//that array.

public class Task6 {
	public static void main(String[] args) {
		
		
		String [][] country= {
				{"North america countries-","USA"," Cuba"," Canada"," Mexico"},
				{"South america countries- "," Brazil"," Peru"," Colombia"," Ecuador"},
				{"Europe countries-"," Germany"," Italy"," France"," UK"," Spain"},
				{"Asian cointries-"," Russia"," Armenia"," Turkey"},
				{"African countries-"," Nigeria"," Algeria"},		
				
		};
		
		
		for(int a=0; a<country.length; a++) {
			for( int b=0; b<country[a].length; b++) {
				System.out.print(country [a][b]);
			}
			System.out.println();
		}
		
		
		
	}

}
