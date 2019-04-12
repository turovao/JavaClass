package com.class20;
//Create a method that will take 1 parameter as a String and return reversed String.
//		Method should be visibly only within same package.
public class Task2 {
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		String reverseWord= obj.reversString("word");
		System.out.println(reverseWord);
		
		
	}
	 protected String reversString(String word) {
		String reverseWord="";
		for (int i=word.length()-1; i>=0; i--) {// indeks start from 0 why -1?
			reverseWord=reverseWord+word.charAt(i);
		}
		return  reverseWord;
	}
	
	
	}



