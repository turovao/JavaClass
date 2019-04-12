package com.class20;
//Create a method that will take a String and return whether String is palindrome or not. 
//		 Method should available to all classes within your projects.

public class AccessModifier1 {
	public static void main(String[] args) {
		AccessModifier1 obj=new AccessModifier1();
		System.out.println(obj.isPalindrom("madam"));
		
	}
	
	
	public boolean isPalindrom(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			
			reversed=reversed+str.charAt(i);
		}
		if(reversed.equalsIgnoreCase(str)) {
			return true;
		}else {
			return false;
		}
	}

}
