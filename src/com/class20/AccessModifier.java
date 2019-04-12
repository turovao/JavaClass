package com.class20;
//Create a method that will take 1 parameter as a String and return reversed String.
//		Method should be visibly only within same package.

public class AccessModifier {
	public static void main(String[] args) {
		
	
	
	AccessModifier obj=new AccessModifier();
	String reversed=obj.reverseString("Hello");
	System.out.println(reversed);
	
	}
	

	protected String reverseString(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			
			reversed=reversed+str.charAt(i);
		}
		return reversed;
	
	
	
	

}}
