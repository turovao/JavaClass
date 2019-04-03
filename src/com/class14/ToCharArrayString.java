package com.class14;

public class ToCharArrayString {
	public static void main(String[] args) {
		
		// toCharArray() - converts string to array of characters
		
				
		String str="Welcome Syntax Students";
        String[] array=str.split("Syntax");
        System.out.println("The length of the array is "+array.length);
        for(String substring: array) {
            System.out.println(substring);
        }
	}

}
