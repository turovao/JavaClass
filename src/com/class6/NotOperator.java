package com.class6;

public class NotOperator {
	public static void main(String[] args) {
//		! reverse result
		// NOT OPERATOR !
		
		boolean a =!true;
		System.out.println("The value of boolean variable is "+a);
		
		//System.out.println("The value of boolean variable is "+!a);
		// OTHER WAY TO PUT !!!
		//Example
		
		
		// if its not snowing --> i will come to the class otherwise i will 
		//stay at home.
		
		boolean snow=true;
		
	// boolean is true thats why nothing is printing
		 if(!snow) {  //    -->if its not snow
			 System.out.println("I will come to the class");
			 
		 }
		 
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("Hello");
		}
		 
		
		//if(!( num1==num2 && num1==num3 && num2==num3));
	}

}
