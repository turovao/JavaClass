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
//In main method set the values by calling setter method and get the values by calling get
//methods
//
//Output
//
//7560504000 Sumair sumair@syntaxsolutions.com 500000.0

public class EncapsulationDemo {

	private long acc_no;
	private String name, email;
	private float amount;

	public void setAcc_no(Long acc_no) {
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public float getAmount() {
		return amount;
		
	}
}