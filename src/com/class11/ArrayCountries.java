package com.class11;



//Create an array of countries. While retrieving all values from an array print 
//capital for each country. (use 2 different loops).


public class ArrayCountries {
	public static void main(String[] args) {
		
		String [] country= {"Russia","Turkey","Canada","France","Japan"};
		
		for( int i=0;  i<country.length; i++) {
			
			 if(country[i]=="Russia") {
	                System.out.println(" Moscow");
	            }
			 if(country[i]=="Turkey") {
				 System.out.println("Ankara");
			 }
			 if(country[i]=="Canada") {
				 System.out.println("Toronto");
			 }
			 if(country[i]=="France") {
				 System.out.println("Paris");
			 }
			 if(country[i]=="Japan") {
				 System.out.println("Tokio");
			 }
			 System.out.println(country[i]);
	
		}
	}
		//---------------------------------------------------------------------
//		 /*Create an array of countries. While retrieving all values from an array print
//	     * capital for each country.*/
//	    public static void main(String[] args) {
	
//	        String[] array = { "USA", "Russia", "Turkey", "Spain" };
//	        for (int i = 0; i < array.length; i++) {
//	            if (array[i].equals("USA")) {
//	                System.out.println("Washington DC");
//	            } else if (array[i].equals("Russia")) {
//	                System.out.println("Moscow");
//	            } else if (array[i].equals("Turkey")) {
//	                System.out.println("Ankara");
//	            } else if (array[i].equals("Spain")) {
//	                System.out.println("Madrid");
//	            }
//	        }
		//______________________________________________________________________
//	        String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
//	        for (String country : contries) {
//	            switch (country) {
//	            case "USA":
//	                System.out.println("Washington DC");
//	                break;
//	            case "Afghanistan":
//	                System.out.println("Kabul");
//	                break;
//	            case "Kazakhstan":
//	                System.out.println("Astana");
//	                break;
//	            case "Ukraine":
//	                System.out.println("Kiev");
//	                break;
//	            }
//	        }
//	    }
	
		
		
	}


