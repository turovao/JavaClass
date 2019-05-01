package com.class29;
//Firstly create class above main class as EncapsulationDemo
//create 
//*private data members  
//private long acc_no;  
//private String name,email;  
//private float amount;  
//
//Use the Setter method to set the values and Getter Method to get the values 
//
//In main method set the values by calling setter method and get the values by calling get methods
//
//Output
//
//7560504000 Sumair sumair@syntaxsolutions.com 

public class Main {
     
	
	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setAcc_no(7560504000l);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000.0f);
		System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
		
	
}
}