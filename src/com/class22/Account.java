package com.class22;

public class Account {
	// Fig. 3.5: Account.java
	   // Account class with a constructor that initializes the name.
	 
	    
	   
	      private String name; // instance variable
	 
	      // constructor initializes name with parameter name               
	       public Account(String name){ // constructor name is class name     
	                                                                     
	       System.out.println(name);                                             
	      }                                                                 
	
	     // method to set the name
	      public void setName(String name)
	      {
	    	  System.out.println(name);
	     }

	      // method to retrieve the name
	     public String getName()
	     {
	        return name;
	     }
	   } // end class Account


